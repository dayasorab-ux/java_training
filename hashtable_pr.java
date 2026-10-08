import java.util.Hashtable;
public class hashtable_pr{
    public static void main(String[]args){
        Hashtable<Integer,String> products = new Hashtable<>();
        products.put(1,"laptop");
        products.put(2,"headphone");
        products.put(3,"mouse ");
        products.put(4,"keyboard");
        System.out.println("Products "+products);
    }
}