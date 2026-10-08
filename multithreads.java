class rest extends trds{
    public void run(){
        System.out.println("restaurant");
    }
}
class waiter extends trds {
    public void run() {
    System.out.println("waiter");
    }
}
class chef extends trds{
    public void run(){
        System.out.println("chef");
    }

}
class cashier extends trds{
    public void run(){
        System.out.println("cashier");
    }

}

public class multithreads{
    public static void main(String[]args){
        waiter w = new waiter();
        rest r = new rest();
        chef c = new chef();
        cashier ch = new cashier();
        w.run();
        r.run();
        c.run();
        ch.run();
    }
}