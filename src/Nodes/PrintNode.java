package Nodes;

public class PrintNode extends Node{
    private Node expression;
    PrintNode(Node expression){
        this.expression=expression;
    }
    @Override
    public int evaluate(){
int value=expression.evaluate();
        System.out.println(value);
        return value;
    }
}
