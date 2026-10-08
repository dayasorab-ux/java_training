import java.util.*;
public class str{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter tha password");
            String n = sc.nextLine();
        int size = n.length();
        if(size >= 8){
            System.out.println("valid password");
        }else{
            System.out.println("invalid");
        }
        }

    }
}