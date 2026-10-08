public class stringinser{
    public static void main(String[]args){
       StringBuilder str = new StringBuilder("Java");
        String programing = " programming";
        str.append(programing);
        str.insert(4, " core");
        System.out.println(str);
        StringBuilder str1 = str.delete(4, 9);
        System.out.println(str1);
        StringBuilder str2 = str.replace(5, 5, "main ");
        System.out.println(str2);
        StringBuilder str3 = str2.reverse();
        System.out.println(str3);
    }
}