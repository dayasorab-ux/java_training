class a {
    int age = 50;
}
class b extends a {
    int age = 50;
    void Display()
    {
        System.out.println("Age of class a: " + age);
        System.out.println( super.age);
    }
}
public class superdemo {
    public static void main(String args[])
    {
        b obj = new b();
        obj.Display();
    }
}