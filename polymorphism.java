class person{
    void display(){
        System.out.println("I am a person");
    }
}
class student extends person{
    @Override void display(){
        System.out.println("I am a child");
    }
}
class employee extends person{
    @Override void display(){
        System.out.println("I am an employee");
    }
}
class friend extends person{
    @Override void display(){
        System.out.println("I am a friend");
    }
}
public class polymorphism {
    public static void main(String args[])
    {
        person obj = new employee();
        obj.display();
    }
}
