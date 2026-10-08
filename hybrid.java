class C
{
    void disp()
    {
        System.out.println("This is class c");
    }
}
class A extends C
{
    void show()
    {
        System.out.println("This is class a");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("This is class b");
    }
}
public class hybrid {
    public static void main(String[] args) {
        B e = new B();
        e.show();
        e.disp();
        e.display();
    }
}