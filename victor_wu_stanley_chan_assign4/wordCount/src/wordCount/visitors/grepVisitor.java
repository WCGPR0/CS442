
package wordCount.visitors;

import wordCount.treesForStrings.TreeBuilder;
import wordCount.treesForStrings.Node;

public class grepVisitor implements TreeProcessingVisitorI{
    
    String searchString;
    
    public grepVisitor(String stringIn){
        searchString = stringIn;
    }
    
    
    
    public int search(Node currentNode, String currentString){
        int compareValue = currentString.compareTo(currentNode.myString);
        //negative number means it comes before it
        //0 means it is equal
        //positive number means it comes after it
        if(compareValue == 0){
            return currentNode.getCount();
        }
        else{
            
            if(compareValue < 0){
                if(currentNode.getLeftNode() == null){
                    return 0;
                }
                else{
                    return search(currentNode.getLeftNode(), currentString);
                }
            }
            else{
                if(currentNode.getRightNode() == null){
                    return 0;
                }
                else{
                    return search(currentNode.getRightNode(), currentString);
                }
            }
        }
    }
    
    @Override
    public void visit(TreeBuilder tb) throws Exception{
        Node currentNode = tb.getRootNode();
        String currentNodeString = currentNode.getString();
        int compareValue = searchString.compareTo(currentNodeString);

        if(compareValue == 0){
            System.out.println(currentNode.getCount());
        }
        else{
            System.out.println("Search string: " + searchString + " occurences: " + search(currentNode,searchString));
        }
    }
}
