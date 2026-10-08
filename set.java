import java.util.HashSet;
//import java.util.Set;

public class set{
    public static void main(String[]args){
        HashSet<String> gmail = new HashSet<>();
        gmail.add("example@gmail.com");
        gmail.add("example001@gmail.com");
        gmail.add("example002@gmail.com");
        gmail.add("example003@gmail.com");
        gmail.add("example001@gmail.com");
        gmail.add("example005@gmail.com");
        System.out.println(gmail);

    }
}