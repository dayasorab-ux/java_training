import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        
        // ---------------------------------------------------------
        // 1. SORTING AN ARRAY
        // ---------------------------------------------------------
        int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers); // Sorts automatically
        
        System.out.println("1. Sorted Array: " + Arrays.toString(numbers));


        // ---------------------------------------------------------
        // 2. TOP K ELEMENTS (Most frequent numbers)
        // ---------------------------------------------------------
        int[] data = {1, 1, 1, 2, 2, 3, 4};
        int k = 2; 
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : data) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(counts.keySet());
        keys.sort((a, b) -> counts.get(b) - counts.get(a));
        List<Integer> topK = keys.subList(0, k);
        System.out.println("2. Top " + k + " Frequent Elements: " + topK);
        // ---------------------------------------------------------
        // 3. FIRST NON-REPEATED ELEMENT
        // ---------------------------------------------------------
        int[] items = {-1, 2, -1, 3, 2};
        Integer firstUnique = null;
        Map<Integer, Integer> orderCounts = new LinkedHashMap<>();
        for (int num : items) {
            orderCounts.put(num, orderCounts.getOrDefault(num, 0) + 1);
        }
        for (int num : orderCounts.keySet()) {
            if (orderCounts.get(num) == 1) {
                firstUnique = num;
                break; 
            }
        }
        System.out.println("3. First Non-Repeated Element: " + firstUnique);
    }
}
