abstract class veheicle{
    public abstract void start();
    /*public void key(){
        System.out.println("This is a car");
    }*/
}
class car extends veheicle{
    public void start(){
        System.out.println("Car is starting with key");
    }
}
public class abs {
    public static void main(String args[])
    {
        veheicle obj = new car();
        obj.start();
        //obj.key();
    }
}

