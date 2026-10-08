import java.util.Stack;
public class stk{
    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("Stack: " + s);
        System.out.println("top elements: " + s.peek());
        System.out.println("pop elements: " + s.pop());
        System.out.println("Stack: " + s);
        System.out.println("stack size "+ s.size());
        System.out.println("is empty: "+s.isEmpty()); 
    }
}