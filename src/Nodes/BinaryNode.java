package Nodes;

public class BinaryNode extends Node{
    private char operator;
    private Node left;
    private Node right;
    BinaryNode(Node left,char operator,Node right){
        this.left=left;
        this.operator=operator;
        this.right=right;
    }
    @Override
    public int evaluate(){
        int leftvalue=left.evaluate();
        int rightvalue=right.evaluate();
        if(operator=='+') return leftvalue+rightvalue;
        if(operator=='-') return leftvalue-rightvalue;
        if(operator=='*') return leftvalue*rightvalue;
        if(operator=='/') return leftvalue/rightvalue;
        throw new RuntimeException("Unknown Error");
    }

}
