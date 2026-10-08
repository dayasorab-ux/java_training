public class recur_re {
    public static int reverse(int n , int result) {
        if (n == 0) { 
            return result; 
        }
        return reverse(n/10, result*10 + n%10); 
    }
    public static void main(String[] args) {
       // int result = reverse(5, 0);
        System.out.println(reverse(1234, 0));
    }
}