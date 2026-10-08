public class uppelower {
    public static void main(String[] args) {
        String str = "admin";
        if (str.toLowerCase().equals(str)) {
            System.out.println("Accepted");
        }else{
            System.out.println("invalid type");
        }
    }
}