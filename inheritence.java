class parent
{
    void Display(){
        System.out.println("from  class");
    }

    void Display1(){
        System.out.println("parent class method");
    }
}
class child extends parent 
{
    void Display(){
        System.out.println("child class");
    }
}
public class inheritence {
    public static void main(String[] args) {
     child ch = new child();
     ch.Display();
     ch.Display1();
    }   
    
}