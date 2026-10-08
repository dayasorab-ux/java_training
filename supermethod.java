class F{
    void Show()
    {
        System.out.println("PARENT F");
    }
}
class C extends F{
    void Show()
    {
        super.Show();
        System.out.println("CHILD C");
    }

}
public class supermethod {
    public static void main(String args[])
    {
        C obj = new C();
        obj.Show();
    }
}
    
