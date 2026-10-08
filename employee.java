class EmployeeThread extends Thread{
    public void run(){
        System.out.println("hi");
    }
}
public class employee{
    public static void main(String[]args){
        EmployeeThread e = new EmployeeThread();
        e.start();
        System.out.println(e.getState());
    }
}