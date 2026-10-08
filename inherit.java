class person
{
    void eat()
    {
        System.out.println("person is eating");
    }
}
class student extends person
{
    int rollno;
    void study()
    {
        System.out.println("student is studying");
    }
}
public class inherit {
    public static void main(String[] args) {
        student s = new student();
        //s.rollno = 101;
        s.eat();
        //System.out.println("roll no is: " + s.rollno);
    }
}