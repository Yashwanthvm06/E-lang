package runtime;

import java.util.*;
public class Environment {

    private static Map<String,Object> values=new HashMap<>();

    public static void set(String name, Object value){
        values.put(name,value);
    }
    public static Object get(String name){
        if(!values.containsKey(name)){
            throw new RuntimeException("Undefined variable: "+name);
        }
        return values.get(name);
    }
}
