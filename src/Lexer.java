import java.util.List;
import java.util.ArrayList;

public class Lexer {
public static List<Token>  tokenize(String line,int lineNumber ){
        List<Token> tokens=new ArrayList<>();

        // character(pointer) of line
        int i=0;

        while(i<line.length()){
           // /*/*/*/*/*
            char current=line.charAt(i);

            // if empty character skip to next char
            if(current == ' '){
                i++;
                continue;
            }
            //column count
    int column=i+1;
            //Numbers
            if(Character.isDigit(current)){
                StringBuilder number=new StringBuilder();

                while(i < line.length() && Character.isDigit(line.charAt(i))){
                    number.append(line.charAt(i));
                    i++;
                }
                //after number in the lines are finished add in token
                tokens.add(new Token(TokenType.NUMBER,number.toString(),lineNumber,column));
                //numbers are checked used continue to move from start to check words
                continue;
            }

            //keywords / identifier
            if(Character.isLetter(current)){
                StringBuilder keywords=new StringBuilder();

                while(i < line.length() && Character.isLetter(line.charAt(i))){
                    keywords.append(line.charAt(i));
                    i++;
                }
                String value = keywords.toString();
                if(value.equals("print")){
                    tokens.add(new Token(TokenType.KEYWORD,value,lineNumber,column));
                }
                else{
                    tokens.add(new Token(TokenType.IDENTIFIER,value,lineNumber,column));
                }
                continue;
            }
            // String
            if(current=='"'){
                i++;
                StringBuilder str=new StringBuilder();
                while(i<line.length() && line.charAt(i)!='"'){
                    str.append(line.charAt(i));
                    i++;
                }

                if(i>=line.length()){
                    throw new RuntimeException("Unterminated String at line "+lineNumber);
                }
                i++;
                tokens.add(new Token(TokenType.STRING,str.toString(),lineNumber,column));
                continue;
            }
            //parenthesis
            if(current=='('){
                tokens.add(new Token(TokenType.LPAREN,"(",lineNumber,column));
                i++;
                continue;
            }
            if(current==')'){
                tokens.add(new Token(TokenType.RPAREN,")",lineNumber,column));
                i++;
                continue;
            }

            if(current == '+' || current == '-' || current == '*' || current == '/'){
                tokens.add(new Token(TokenType.OPERATOR,String.valueOf(current),lineNumber,column));
                i++;
                continue;
            }
 throw new RuntimeException("Unknown Character: '"+current+"' at line"+lineNumber + " ,"+column);
        }
return tokens;
}
}
