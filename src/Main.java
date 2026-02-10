import Nodes.*;
import runtime.Environment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("please provide the .el file");
            return;
        }

        if (args.length > 1) {
            System.out.println("ufff wait.. tooo many arguments");
            return;
        }

        String fileName = args[0];
        if (!fileName.endsWith(".el")) {
            System.out.println("Hey this is elang :(, only .el files allowed");
            return;
        }

        List<Statement> statements = new ArrayList<>();
        Environment env = new Environment();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    lineNumber++;
                    continue;
                }

                List<Token> tokens = Lexer.tokenize(line, lineNumber);

                // parse tokens → AST nodes
                Parser parser = new Parser(tokens, env);

                while (!parser.isAtEnd()) {
                    Statement stmt = parser.parseStatement();
                    statements.add(stmt);
                }

                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("Error reading the provided file: " + e.getMessage());
            return;
        }

        // execute AFTER parsing everything
        ProgramNode program = new ProgramNode(statements);
        program.execute();
    }
}
