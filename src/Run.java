import runtime.Environment;

public class Run {
    public static void main(String[] args) {
        Environment em= new Environment();
        em.set("x","yash");
        em.set("Y",10);
        System.out.println(em.get("x"));
        System.out.println(em.get("Y"));
    }
}
