import java.util.*;
public class inputismatch {
    public static void main(String[]args){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
    catch(InputMismatchException e){
            System.out.println("error");
        }
    }
}
