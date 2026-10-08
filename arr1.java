import java.util.Arrays;

public class arr1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Before swap: " + Arrays.toString(numbers));
        swap(numbers, 1, 3);
        System.out.println("After swap:  " + Arrays.toString(numbers));
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}