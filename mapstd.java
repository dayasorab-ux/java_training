import java.util.HashMap;
//import java.util.Map;

public class mapstd{
    public static void main(String[]args){
        HashMap<Integer,String> std = new HashMap<>();
        std.put(101,"Dayashankar");
        std.put(102,"Darshan bs");
        std.put(103,"Clinton");
        std.put(105,"Darshan");
        System.out.println("students "+std);
        System.out.println("Students 101 "+std.get(101));

    }
}