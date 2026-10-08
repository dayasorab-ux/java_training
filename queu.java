import java.util.Queue;
import java.util.LinkedList;

public class queu{
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
            q.offer(10);
            q.offer(20);
            q.offer(30);
            q.offer(40);
            q.offer(50);
            System.out.println("queue" +q);
            System.out.println("peek elements:"+q.peek());
            System.out.println("poll elements:"+q.poll());
            System.out.println("queue" +q);
            System.out.println("queue size"+q.size());
            System.out.println("is empty:"+q.isEmpty());
    }
}