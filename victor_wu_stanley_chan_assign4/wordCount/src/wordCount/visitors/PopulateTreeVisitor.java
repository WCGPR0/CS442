package wordCount.visitors;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import wordCount.treesForStrings.TreeBuilder;
import wordCount.treesForStrings.Node;

public class PopulateTreeVisitor implements TreeProcessingVisitorI{
  
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    
    public PopulateTreeVisitor(InputStream isIn){
        is = isIn;
        this.isr = new InputStreamReader(is);
        this.br = new BufferedReader(isr);
        
    }
    
    public void insert(Node currentNode, String currentString){
        int compareValue = currentString.compareTo(currentNode.myString);
        //negative number means it comes before it
        //0 means it is equal
        //positive number means it comes after it
        if(compareValue == 0){
            currentNode.incrementCount();
        }
        else{
            Node newNode = new Node();
            newNode.incrementCount();
            newNode.setString(currentString);
            
            if(compareValue < 0){
                if(currentNode.getLeftNode() == null){
                    currentNode.setLeftNode(newNode);
                }
                else{
                     insert(currentNode.getLeftNode(), currentString);
                }
            }
            else{
                if(currentNode.getRightNode() == null){
                    currentNode.setRightNode(newNode);
                }
                else{
                    insert(currentNode.getRightNode(), currentString);
                }
            }
        }
    }
    
    @Override
    public void visit(TreeBuilder tb) throws Exception{
        String line = "";
        while((line = br.readLine()) != null){
            String[] words = line.split("\\s+");
            for(int i = 0; i < words.length; i++){
                Node currentNode = tb.getRootNode();
                //if not null then we must check if its equal
                //less than or greater than current string
                if(currentNode == null){
                    Node newNode = new Node();
                    newNode.setString(words[i]);
                    newNode.incrementCount();
                    tb.setRootNode(newNode);
                }
                else{
                    insert(currentNode, words[i]);
                }
            }
        }
        printInOrder(tb.getRootNode());
    }
    
    public void printInOrder(Node currentNode){
        if(currentNode != null){
            printInOrder(currentNode.leftNode);
            System.out.println(currentNode.myString);
            System.out.println(currentNode.count);
            System.out.println("====");

            printInOrder(currentNode.rightNode);
            
        }
    }
    
}

