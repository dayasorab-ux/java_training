import java.util.LinkedHashMap;
public class linkedhashmap{
    public static void main(String[]args){
        LinkedHashMap<Integer, String> emp = new LinkedHashMap<>();
        emp.put(101,"Dayashankar");
        emp.put(102,"Darshan bs");
        emp.put(103,"Clinton");
        emp.put(105,"Darshan");
        System.out.println("employee "+emp);
        System.out.println("employee 101 "+emp.get(101));

    }

}