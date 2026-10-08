import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator{
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        ListIterator<String> it = names.listIterator();
        System.out.println("Forward Direction");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Backward Direction");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

    }
}