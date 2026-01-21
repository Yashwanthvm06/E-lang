import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
    while((line= reader.readLine())!=null){
        line =line.trim();
        if(line.isEmpty()){
            continue;
        }
        System.out.println(line);
    }
}
catch(IOException e){
    System.out.println("Error reading the provided file: " + e.getMessage());
}
    }
}
