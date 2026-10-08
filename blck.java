class work extends Thread{
    public void run(){
        System.out.println("hi");
    }
}

public class blck{
    public static void main(String[]args) 
    throws InterruptedException{
        work w = new work();
        Thread t = new Thread();
        t.start();
        t.join();
        System.out.println(t.getState());
        System.out.println(w.getState());
    }
}