import Nodes.BinaryNode;
import Nodes.Node;
import Nodes.NumberNode;

import java.util.List;
public class Parser {
    private List<Token> tokens;
    private int position=0;
    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }
    public Token peek(){
        if(position<tokens.size()){
            return tokens.get(position);
        }
        return null;
    }
    public Token consume(){
        Token current=peek();
        position++;
        return current;
    }
    public Token match(TokenType expectedType){
        if(peek()==null){
            throw new RuntimeException("Unexpected token");
        }
        else if(peek().type==expectedType){
            return consume();
        }
        else{
            throw new RuntimeException();
        }
    }

    public Node parseFactor(){
        if(peek().type==TokenType.NUMBER){
            Token t=consume();
            return new NumberNode(Integer.parseInt(t.value));
        }
        if(peek().type==TokenType.LPAREN){
            consume();
            Node expr = parseExpression();
            match(TokenType.RPAREN);
            return expr;
        }
        throw new RuntimeException("Invalid factor");
    }
        public Node parseTerm(){
            Node left=parseFactor();
            while(peek()!=null && peek().type==TokenType.OPERATOR && (peek().value.equals("*") || peek().value.equals("/"))){
            Token op= consume();
            Node right = parseFactor();
            left= new BinaryNode(left,op.value.charAt(0),right);
            }
return left;
        }
    public Node parseExpression() {
        Node left=parseTerm();
        while(peek()!=null && peek().type==TokenType.OPERATOR && (peek().value.equals("+") || peek().value.equals("-"))){
            Token op =consume();
            Node right=parseTerm();
            left=new BinaryNode(left,op.value.charAt(0),right);
        }
        return left;
    }


}
