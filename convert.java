public class convert{
    public static void main(String[]args){
       String str = "ADMIN";
        if (str.equals(str.toLowerCase())) {
            System.out.println("Accepted"+str.toLowerCase());
        }else{
            System.out.println("invalid type"+str.toUpperCase());
        }
    }
}