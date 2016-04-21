package wordCount.treesForStrings;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import wordCount.treesForStrings.Node;
import wordCount.visitors.TreeProcessingVisitorI;

public class TreeBuilder{
    
    Node rootNode;
    
    public TreeBuilder(){
        rootNode = null;
    }

    public void accept(TreeProcessingVisitorI visitor) throws Exception{
        visitor.visit(this);
    }
    
    public Node getRootNode(){
        return rootNode;
    }
    
    public void setRootNode(Node n){
        rootNode = n;
    }
 
    /*http://stackoverflow.com/questions/9181594/reading-text-from-file-and-store-each-word-from-every-line-into-separate-variabl*/
    /*
    public void populateTree(BufferedReader brIn) throws Exception{
        br = brIn;
        String line = "";
        while((line = br.readLine()) != null){
            String[] words = line.split("\\s+");
            for(int i = 0; i < words.length; i++){
                Node currentNode = new Node();
                currentNode = rootNode;
                //if not null then we must check if its equal
                //less than or greater than current string
                while(currentNode != null){
                    //negative number means it comes before it
                    //0 means it is equal
                    //positive number means it comes after it
                    int compareValue = words[i].compareTo(currentNode.myString);
                    if(compareValue < 0){
                        currentNode = currentNode.leftNode;
                    }
                    else if(compareValue == 0){
                        currentNode.count = currentNode.count + 1;
                        currentNode = null;
                    }
                    else{
                        currentNode = currentNode.rightNode;
                    }
                }
                //we have reached an empty node location
                //place our new word here
                Node newNode = new Node();
                newNode.myString = words[i];
                newNode.count = 1;
                currentNode = newNode;
            }
        }
        System.out.println("Hi there");
    }*/
}