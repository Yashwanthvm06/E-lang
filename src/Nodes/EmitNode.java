package Nodes;

public class EmitNode extends Node{
    Node expression;

    public EmitNode(Node expression){
        this.expression=expression;
    }

    @Override
    public Object evaluate(){
        Object value=expression.evaluate();
        System.out.println(value);
        return value;
    }
}
