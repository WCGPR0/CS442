package wordCount.visitors;

import wordCount.treesForStrings.TreeBuilder;
import wordCount.treesForStrings.Node;
import java.util.Vector;

public class WordCountVisitor implements TreeProcessingVisitorI{

   // int charCount;w
   // int wordCount;
    static Vector<Node> mostFrequentWordNodes; 
    
    public WordCountVisitor(){
    //    charCount = 0;
     //   wordCount = 0;
    mostFrequentWordNodes = new Vector<Node>();
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
/*        if(currentNode != null){
            if(vector.size() == 0){
                mostFrequentWordNodes.add(currentNode);
            }
            mostFrequentWordNodes = getMostFrequent(currentNode.getLeftNode())
  */
	Node max = currentNode;	
	if (currentNode.getLeftNode() != null) {
		Node node = getMostFrequent(currentNode.getLeftNode());		
	       	if (node.count == max.count)
			mostFrequentWordNodes.add(node);	
		else if (node.count > max.count) {
			max = node;
			mostFrequentWordNodes.clear();
		}
	}
	if (currentNode.getRightNode() != null) {
		Node node = getMostFrequent(currentNode.getRightNode());
		if (node.count == max.count)
			mostFrequentWordNodes.add(node);
		else if (node.count > max.count) {
			max = node;
			mostFrequentWordNodes.clear();
		}
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
	System.out.printf("The most frequently used word is: %s ", getMostFrequent(currentNode).myString);
	for (Node n : mostFrequentWordNodes) {
		System.out.print(n.myString + " ");
	}
	System.out.println();
        System.out.printf("The number of characters (without whitespaces) is: %d\n", getCharCount(currentNode));
        System.out.printf("The word < %s > occurs the following times: %d\n", currentNode.myString, getWordCount(currentNode));

    }
}
