class Result extends Thread{
    public void run(){
        System.out.println("---result---");
        try{
            System.out.println("marks calculating");
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("delay");
        }
        System.out.println("Result ready");
    }
}
public class Join_Thread{
    public static void main(String[]args) 
        throws Exception{
        Result r = new Result();
        //Thread t = new Thread();
        r.start();
        r.join();
        r.interrupt();
        System.out.println("hello this is the last statement");
    }
}