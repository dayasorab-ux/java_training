import java.util.PriorityQueue;

public class pq{
    public static void main(String[]args){
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(2);
        num.add(29);
        num.add(27);
        num.add(3);
        num.add(-6);
        num.add(11010101);
        num.add(888);
        num.add(-44);
        while(!num.isEmpty()){
            System.out.println(num.poll());
        }
    }
}