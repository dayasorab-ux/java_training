import java.util.*;
public class palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Check for palindrome");
            String input = sc.nextLine();
            System.out.println(input);
            StringBuilder sb2 = new StringBuilder(input).reverse();
            if(input.equals(sb2.toString())){
                System.out.println("it is palindrome");
            }else{
                System.out.println("it is not");
            }
        } finally {
            sc.close();
        }
    }
}