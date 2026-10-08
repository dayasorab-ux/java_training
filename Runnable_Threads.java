class cabbooking implements Runnable{
    public void run(){
        System.out.println("cab is booked");
    }
}
public class Runnable_Threads{
    public static void main(String[]args){
        cabbooking Task = new cabbooking();
        Thread t = new Thread(Task);
        t.start();
    }                                                                          
    
}