public class throws_and_throw {
    static void demo(String[]args){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("this is an error");
            throw e;
        }
    }
    public static void main(String[]args){
        try{
            demo(args);
        }
        catch(NullPointerException e){
            System.out.println("caught the error");
        }
    }
}
