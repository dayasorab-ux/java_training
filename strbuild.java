public class strbuild{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("hello ");
        String str = "world";
        sb.append(str);
        String str1 = sb.toString();
        System.out.println(str1);
    }
}