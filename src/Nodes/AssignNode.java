package Nodes;

import runtime.Environment;

public class AssignNode extends Statement {
    private String name;
    private Expression value;

    public AssignNode(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void execute() {
        Object result = value.evaluate();
        Environment.set(name, result);
    }
}
