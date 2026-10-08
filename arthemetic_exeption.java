public class arthemetic_exeption{
    public static void main(String[]args){
            System.out.println("Start");
            try {
                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println(+result);
            } catch (ArithmeticException e) {
                System.out.println("error: " + e.getMessage());
            }
        System.out.println("End");
    }
}
