import Nodes.*;
import runtime.Environment;

import java.util.ArrayList;
import java.util.List;
public class Parser {
    private Environment environment;

    public Parser(List<Token> tokens, Environment environment){
        this.tokens=tokens;
        this.environment=environment;
    }

    private List<Token> tokens;
    private int position=0;

    public Token peek(){
        if(position<tokens.size()){
            return tokens.get(position);
        }
        return null;
    }
    public Token peekNext(){
        if(position+1< tokens.size()){
            return tokens.get(position+1);
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

    private Expression parseFactor(){
        if(peek()==null){
            throw new RuntimeException("Unexpected end of input");
        }
        if(peek().type==TokenType.NUMBER){
            Token t=consume();
            return new NumberNode(Integer.parseInt(t.value));
        }
        if(peek().type==TokenType.STRING){
            Token t=consume();
            return new StringNode(t.value);
        }
        if(peek().type==TokenType.IDENTIFIER){
            Token t=consume();
            return new VariableNode(t.value,environment);
        }
        if(peek().type==TokenType.LPAREN){
            consume();
            Expression expr = parseExpression();
            match(TokenType.RPAREN);
            return expr;
        }
        throw new RuntimeException("Invalid factor");
    }

        private Expression parseTerm(){
            Expression left=parseFactor();
            while(peek()!=null && peek().type==TokenType.OPERATOR && (peek().value.equals("*") || peek().value.equals("/"))){
            Token op= consume();
                Expression right = parseFactor();
            left= new BinaryNode(left,op.value.charAt(0),right);
            }
return left;
        }

    public Expression parseExpression() {
        Expression left=parseTerm();
        while(peek()!=null && peek().type==TokenType.OPERATOR && (peek().value.equals("+") || peek().value.equals("-"))){
            Token op =consume();
            Expression right=parseTerm();
            left=new BinaryNode(left,op.value.charAt(0),right);
        }
        return left;
    }
    public Statement parseStatement(){
        if(peek()==null){
            throw new RuntimeException("Unexpected end of input");
        }
        if(peek().type==TokenType.KEYWORD && peek().value.equals("emit")){
            consume();
            match(TokenType.LPAREN);
            Expression expr=parseExpression();
            match(TokenType.RPAREN);
            return new EmitNode(expr);
        }
        else if(peek().type==TokenType.IDENTIFIER &&
                peekNext()!=null &&
                peekNext().type==TokenType.ASSIGN){
            String name=consume().value;
            consume();
            Expression value=parseExpression();
            return new AssignNode(name, value);
        }
        throw new RuntimeException("Invalid Statement");
    }
    public List<Statement> parseProgram(){
        List<Statement> statements=new ArrayList<>();
        while(peek()!=null && peek().type!=TokenType.EOF){
            Statement stmt=parseStatement();
            statements.add(stmt);
        }
        return statements;
    }

    public boolean isAtEnd(){
        return position >= tokens.size();
    }
}

