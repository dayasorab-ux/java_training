public class sync{
    synchronized void printMsg(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[]args){
        sync s = new sync();
        new Thread(s::printMsg, "t1").start();
        new Thread(s::printMsg, "t2").start();

    }
    
}
