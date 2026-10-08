import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(10);
          numbers.add(20);
          numbers.add(30);
          numbers.add(40);
          Iterator<Integer> it = numbers.iterator();
          while(it.hasNext()){
                System.out.println(it.next());
            }
    }
}