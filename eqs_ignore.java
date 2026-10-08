public class eqs_ignore{
    public static void main(String[]args){
        String username = "Admin";
        if(username.equalsIgnoreCase("Admin")){
            System.out.println("successful");
        }else{
            System.out.println("unsuccessful");
        }
    }
}