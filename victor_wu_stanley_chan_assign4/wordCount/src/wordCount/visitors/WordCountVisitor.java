package wordCount.visitors;

import wordCount.treesForStrings.TreeBuilder;
import wordCount.treesForStrings.Node;
import java.util.Vector;

public class WordCountVisitor implements TreeProcessingVisitorI{

   // int charCount;w
   // int wordCount;
    //Vector<Node> mostFrequentWordNodes;
    
    
    public WordCountVisitor(){
    //    charCount = 0;
     //   wordCount = 0;
     //   mostFrequentWordNodes = new Vector<Node>();
    }
    
    public int getCharCount(Node currentNode){
        int currentCharCount = 0;
        if(currentNode != null){
            currentCharCount = getCharCount(currentNode.getLeftNode()) + (currentNode.getCount() * currentNode.getString().length()) + getCharCount(currentNode.getRightNode());
        }
        return currentCharCount;
    }
    
    public int getWordCount(Node currentNode){
        int currentWordCount = 0;
        if(currentNode != null){
            currentWordCount = getWordCount(currentNode.getLeftNode()) + currentNode.getCount() + getWordCount(currentNode.getRightNode());
        }
        return currentWordCount;
    }
    
    public Node getMostFrequent(Node currentNode){
  //      Vector<Node> mostFrequentWordNodes = new Vector<Node>();
/*        if(currentNode != null){
            if(vector.size() == 0){
                mostFrequentWordNodes.add(currentNode);
            }
            mostFrequentWordNodes = getMostFrequent(currentNode.getLeftNode())
  */
	Node max = currentNode;	
	if (currentNode.getLeftNode() != null) {
		Node node = getMostFrequent(currentNode.getLeftNode());
		max = node.count < max.count ? max : node; 
			}
	if (currentNode.getRightNode() != null) {
		Node node = getMostFrequent(currentNode.getRightNode());
		max = node.count < max.count ? max : node;
	}
	return max;	
    }

    public int getTotalWordCount(Node currentNode) {
	int count = getWordCount(currentNode);
	if (currentNode.getLeftNode() != null)
		count += getWordCount(currentNode.getLeftNode());
	if (currentNode.getRightNode() != null)
		count += getWordCount(currentNode.getRightNode());
	return count;
    }
    
    
    @Override
    public void visit(TreeBuilder tb) throws Exception{
        Node currentNode = tb.getRootNode();
	System.out.printf("The total number of words is: %d\n", getTotalWordCount(currentNode));
	System.out.printf("The most frequently used word is: %d\n", getMostFrequent(currentNode).count);
        System.out.printf("The number of characters (without whitespaces) is: %d\n", getCharCount(currentNode));
        System.out.printf("The word < %s > occurs the following times: %d\n", currentNode.myString, getWordCount(currentNode));

    }
}
