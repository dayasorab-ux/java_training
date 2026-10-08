import java.util.*;
public class recur_combi{
    static void main(int[] arr,int start, int k, List<Integer>current){
        if(current.size()==k){
            System.out.println(current);
            return;
        }
        for(int i=start;i<arr.length;i++){
            current.add(arr[i]);
            main(arr,i+1,k,current);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 2;
        List<Integer> current = new ArrayList<>();
        main(arr,0,k,current);
    }
}