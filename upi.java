abstract class payment{
    void pay()
    {
        System.out.println("Payment is done");
    }   
}
class up extends payment{
    void pay()
    {
        System.out.println("Payment is done through UPI");
    }
}
class creditcard extends payment{
    void pay()
    {
        System.out.println("Payment is done through credit card");
    }
}
class debitcard extends payment{
    void pay()
    {
        System.out.println("Payment is done through debit card");
    }
}
class netbanking extends payment{
    void pay()
    {
        System.out.println("Payment is done through net banking");
    }
}
public class upi {
    public static void main(String args[])
    {
        payment obj = new up();
        obj.pay();
        payment obj1 = new creditcard();
        obj1.pay();
        payment obj2 = new debitcard();
        obj2.pay();
        payment obj3 = new netbanking();
        obj3.pay();

    }
}