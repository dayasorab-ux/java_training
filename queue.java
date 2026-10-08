import java.util.LinkedList;
import java.util.Queue;

public class queue{
    public  static void main(String[]args){
        Queue<String> cust = new LinkedList<>();
        cust.add("cust 1");
        cust.add("cust 2");
        cust.add("cust 3");
        System.out.println("queue "+cust);
        System.out.println("servicing "+cust.peek());
        cust.poll();
        System.out.println("remaining "+cust);
    }
}