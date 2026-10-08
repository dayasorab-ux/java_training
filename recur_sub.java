import java.util.List;
import java.util.ArrayList;

public class recur_sub{
    public static void generate(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) { 
            result.add(new ArrayList<>(current));
            return; 
        }
        
        current.add(arr[index]);
        generate(arr, index + 1, current, result);
        current.remove(current.size() - 1);
        
        generate(arr, index + 1, current, result);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}