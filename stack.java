import java.util.Stack;
public class stack{
    public static void main(String[]args){
        Stack<String> prog = new Stack<>(); 
        prog.push("python");
        prog.push("java");
        prog.push("c");
        prog.push("javascript");
        System.out.println(prog);
    }
}