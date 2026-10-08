import java.util.LinkedHashSet;

public class linkedhashset{
    public static void main(String[]args){
        LinkedHashSet<String> prog = new LinkedHashSet<>();
        prog.add("python");
        prog.add("java");
        prog.add("javascript");
        prog.add("c");
        prog.add("c");
        prog.add("javascript");
        prog.add("C++");
        System.out.println(prog);
    }
}