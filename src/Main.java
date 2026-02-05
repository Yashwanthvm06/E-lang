import Nodes.Node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("please provide the .el file");
            return ;
        }
        if(args.length>1){
            System.out.println("ufff wait.. tooo many arguments");
            return;
        }

        String name_check=args[0];
        if(!name_check.endsWith(".el")){
            System.out.println("Hey this is elang only .el files allowed");
            return ;
        }

        try(BufferedReader reader=new BufferedReader(new FileReader((args[0])))){
                String line;
                int lineNumber=1;
            while((line= reader.readLine())!=null){
                line =line.trim();
                //if no code in file
                    if(line.isEmpty()){
                        lineNumber++;
                        continue;
                    }
         // tokenizing
                List<Token> tokens=Lexer.tokenize(line,lineNumber);
                // Create parser
                Parser parser = new Parser(tokens);

// Run all statements in this line
                while (!parser.isAtEnd()) {
                    Node stmt = parser.parseStatement();
                    stmt.evaluate();
                }
        /*for(Token token:tokens){
            System.out.println("Tokens: "+token);
        }*/
lineNumber++;
    }
}
    catch(IOException e){
    System.out.println("Error reading the provided file: " + e.getMessage());
}
    }
}
