class myThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class threads {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
