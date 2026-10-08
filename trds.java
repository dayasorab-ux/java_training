class delivery extends Thread {
    @Override
    public void run() {
        System.out.println("delivery person delivering order");
    }
}
public class trds{
    public static void main(String[] args) {
        delivery d = new delivery();
        d.start();
    }
}