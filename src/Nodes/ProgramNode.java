package Nodes;
import java.util.List;

public class ProgramNode extends Statement{
public List<Statement> statements;

public ProgramNode(List<Statement> statements){
    this.statements=statements;

}
    @Override
    public void execute() {
        for(Statement stmt:statements){
            stmt.execute();
        }
    }
}
