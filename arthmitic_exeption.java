public class arthmitic_exeption {
    public static void main(String[]args){
        try{
        System.out.println(18/3);
        System.out.println(2/3);
        System.out.println(3/0);
        System.out.println(58/2);
        System.out.println(68/4);
        }
    catch(ArithmeticException e){
        System.out.println("error: " + e.getMessage());
    }}
    
}
