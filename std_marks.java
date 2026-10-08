import java.util.*;
public class std_marks{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++)
                arr[i] = sc.nextInt();
            System.out.println("====================================");
            for(int i = 0;i < n;i++)
                System.out.println(arr[i]+" ");
        }
    }

}