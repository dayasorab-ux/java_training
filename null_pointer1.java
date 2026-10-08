public class null_pointer1 {
    public static void main(String[]args){
        try{
            String name = null;
            System.out.println(name.length());
            System.out.println(name.toUpperCase());
            System.out.println(name.charAt(1));
        }
        catch(NullPointerException e){
            System.out.println("error ");
        }
    }
    
}
