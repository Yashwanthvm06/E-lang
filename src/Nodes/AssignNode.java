package Nodes;
import runtime.Environment;

public class AssignNode extends Node {
    private Environment evironment;
    private String name;
    private Node value;

    public AssignNode(String name, Node value,Environment environment) {
        this.name = name;
        this.value = value;
        this.evironment=environment;
    }

    @Override
    public Object evaluate() {
        Object result = value.evaluate();
        Environment.set(name, result);
        return result;
    }
}
