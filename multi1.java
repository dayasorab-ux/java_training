interface phone 
{
    void call();
}


interface camera 
{
    void takephoto();
}


class smartphone implements phone, camera 
{
    public void call()
    {
        System.out.println("Smartphone came make callls...");
    }
    public void takephoto()
    {
        System.out.println("smartphone came take photos...");
    }
}


public class multi1 
{
    public static void main(String[] args) 
    {
        smartphone m = new smartphone();
        m.call();
        m.takephoto();
    }
}