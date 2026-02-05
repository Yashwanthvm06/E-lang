package Nodes;

public class EmitNode extends Node{
    Node expression;

    public EmitNode(Node expression){
        this.expression=expression;
    }

    @Override
    public int evaluate(){
        int value=expression.evaluate();
        System.out.println(value);
        return value;
    }
}
