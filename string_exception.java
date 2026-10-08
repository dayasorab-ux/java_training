public class string_exception { 
    public static void main(String[]args)
    {
        try{
            String name = "8073516950";
            System.out.println(name.charAt(55));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("error");
        }
    }
    
}
