class Download extends Thread{
    public void run(){
        try{
            System.out.println("Downloading.........");
            Thread.sleep(1000);
            System.out.println("Download completed");
        }
        catch(InterruptedException e){
            System.out.println("download canceled");
        }
    }
}
public class Inturupted_Thread {
    public static void main(String[]args)
    throws Exception{
        Download d = new Download();
        d.start();
        d.interrupt();
    }
}