package Nodes;

public class BinaryNode extends Expression {

    private Expression left;
    private Expression right;
    private char operator;

    public BinaryNode(Expression left, char operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public Object evaluate() {
        Object l = left.evaluate();
        Object r = right.evaluate();

        int a = (Integer) l;
        int b = (Integer) r;

        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new RuntimeException("Unknown operator");
        };
    }
}
