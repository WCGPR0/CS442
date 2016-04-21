package wordCount.treesForStrings;

public class Node{
    
    public String myString;
    public int count;
    public Node leftNode;
    public Node rightNode;
    
    public Node(){
        this.leftNode = null;
        this.rightNode = null;
        this.myString = null;
        this.count = 0;
    }
    
    public String getString(){
        return myString;
    }
    
    public void setString(String s){
        this.myString = s;
    }
    
    public int getCount(){
        return count;
    }
    
    public void incrementCount(){
        count = count + 1;
    }
    public Node getLeftNode(){
        return leftNode;
    }
    
    public void setLeftNode(Node n){
        leftNode = n ;
    }
    
    public Node getRightNode(){
        return rightNode;
    }
    
    public void setRightNode(Node n){
        rightNode = n ;
    }

}