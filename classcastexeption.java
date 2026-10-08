public class classcastexeption {
    public static void main(String[]args){
        try{
            Object obj = new Integer(100);
            String str = (String)obj;
            System.out.println(str);
        }
        catch(ClassCastException e){
            System.out.println("error");
        }
    }
}
