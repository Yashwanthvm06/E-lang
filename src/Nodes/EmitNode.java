package Nodes;

public class EmitNode extends Statement {
    private Expression expression;

    public EmitNode(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void execute() {
        Object value = expression.evaluate();
        System.out.println(value);
    }
}
