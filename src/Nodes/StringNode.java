package Nodes;

public class StringNode extends Node{
    private String str;
    public StringNode(String value){
        this.str=value;
    }
    @Override
    public Object evaluate(){
        return str;
    }
}
