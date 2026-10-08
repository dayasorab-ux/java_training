public class numberformatexp {
    public static void main(String[]args){
        try{
            String name = "8073516950";
            int num = Integer.parseInt(name);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("error");
        }
    }        
    
}
