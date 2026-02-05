package Nodes;

public class BinaryNode extends Node {
    private char operator;
    private Node left;
    private Node right;

    public BinaryNode(Node left, char operator, Node right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public Object evaluate() {
        Object leftvalue = left.evaluate();
        Object rightvalue = right.evaluate();
        if (!(leftvalue instanceof Integer) || !(rightvalue instanceof Integer)) {
            throw new RuntimeException("Binary operation require numbers");
        }
        int l = (Integer) leftvalue;
        int r = (Integer) rightvalue;
        switch ( operator ) {
            case '+':
                return l + r;
            case '-':
                return l - r;
            case '*':
                return l * r;
            case '/':
                return l / r;
        }
        throw new RuntimeException("Unknown Error");
    }
}
