public class FactorialExample {
    public static long sum(long n) {
        if (n <=1) { 
            return 1; 
        }
        return n + sum(n - 1); 
    }
    public static void main(String[] args) {
        long result = sum(5);
        System.out.println("Sum:" + result);
    }
}