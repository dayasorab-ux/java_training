public class even_odd_arr {
    public static void main(String[] args) {
        int[] arr = {11, 20, 30, 45, 58, 61};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even");
            } else {
                System.out.println(arr[i] + " is odd");
            }
        }

    }
}