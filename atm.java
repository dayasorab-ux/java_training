abstract class atms{
    public abstract void transaction();
    
}
class sbiatm extends atms
{
    public void transaction()
    {
        System.out.println("checking account balance");
        System.out.println("verifying pin");
        System.out.println("proceeding transcation");
        System.out.println("money withdrawn ");
    }
}

public class atm {
    public static void main(String args[])
    {
        atms obj = new sbiatm();
        obj.transaction();

    }
}
