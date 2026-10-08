import java.util.ArrayDeque;
//import java.util.ArrayList;
import java.util.Deque;

public class dequeue{
    public static void main(String[]args){
        Deque<Integer> num = new ArrayDeque<>();
        num.addFirst(2);
        num.add(29);
        num.addLast(27);
        num.add(3);
        num.addLast(-6);
        num.add(11010101);
        num.addFirst(888);
        num.addLast(-44);
        System.out.println("deque"+num);
    }
}