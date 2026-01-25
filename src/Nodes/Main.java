package Nodes;

public class Main {
    public static void main(String[] args) {
        Node n = new PrintNode(
                new BinaryNode(
                        new NumberNode(2),
                        '*',
                        new NumberNode(5)
                )
        );

        n.evaluate();

    }
}
