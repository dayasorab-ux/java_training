public class VariableSlidingWindow {
    public static int minSubarrayLen(int target, int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int start = 0;

        // 'end' pointer expands the window
        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];

            // Shrink the window from the left as long as the condition is met
            while (windowSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                windowSum -= arr[start];
                start++; // Move left pointer forward
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Min length subarray: " + minSubarrayLen(target, arr));
        // Output: 2 (from subarray [4, 3])
    }
}
