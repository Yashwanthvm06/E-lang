package Nodes;

import runtime.Environment;

public class VariableNode extends Expression{
    private String name;
    private Environment env;
    public VariableNode(String name,Environment env) {
        this.name = name;
        this.env=env;
    }
    @Override
    public Object evaluate(){
        return env.get(name);
    }
}
