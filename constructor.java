class p{
    p(int a){
        System.out.println("Constructor");
    }
}
class q extends p{
    void Show(){
        System.out.println("child");
    }
}
public class constructor {
    public static void main(String args[])
    {
        q obj = new q(10);
        obj.Show();
    }

}
