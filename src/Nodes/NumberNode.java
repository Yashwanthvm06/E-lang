package Nodes;

public class NumberNode extends Expression{
    private int value;
    public NumberNode(int value){
        this.value=value;
    }
    @Override
    public Object evaluate(){
return value;
    }
}
