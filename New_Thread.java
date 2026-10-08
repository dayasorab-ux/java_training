class work extends Thread{
    public void run(){
        System.out.println("hi");
    }
}

public class New_Thread{
    public static void main(String[]args){
        Thread t = new Thread();
        System.out.println(t.getState());
    }
}