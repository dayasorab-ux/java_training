class Tsignal extends Thread{
    public void run(){
        try{
            System.out.println("Red");
            Thread.sleep(1000);
            System.out.println("yellow");
            Thread.sleep(1000);
            System.out.println("Green");
        }
        catch(InterruptedException e){
            System.out.println("default or no signal");
        }
    }
}
public class traffic{
    public static void main(String[]args){
        Tsignal ts = new Tsignal();
        ts.start();
        System.out.println("last statement");
    }

}