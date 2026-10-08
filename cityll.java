import java.util.LinkedList;

public class cityll{
    public static void main(String[]args){
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Bengaluru");
        cities.addLast("Chandighar");
        cities.add("Amritsar");
        cities.addFirst("Delhi");
        cities.add("Hydrabad");
        System.out.println(cities);

    }
}