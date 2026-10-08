import java.util.*;
public class exp {
    public static void main(String[]args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            int num = sc.nextInt();
            System.out.println("enter the float value:");
            float f = sc.nextFloat();
            System.out.println("enter the string");
            String str = sc.next();
            System.out.println("enter long value");
            long l = sc.nextLong();
            System.out.println("enter the double value");
            double d = sc.nextDouble();
            System.out.println("number is:"+num);
            System.out.println("float value is:"+f);
            System.out.println("string is:"+str);
            System.out.println("long value is:"+l);
            System.out.println("double"+d);
        }
        catch(InputMismatchException e){
            System.out.println("error");
        }
    }
    
}
