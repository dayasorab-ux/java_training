import java.util.*;
public class ex_demo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        try{
            int result = a/b;
            System.out.println("result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("error you cannot divide by zero");
        }


    }
}
