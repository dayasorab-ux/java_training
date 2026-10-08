class test{
    static int count = 0;
    public static void main(String[] args)
    throws Exception{
        Thread t1 = new Thread(() -> count++);
        Thread t2 = new Thread(() -> count++);

        t1.start();
        t2.start();
         
        t1.join();
        t2.join();
        System.out.println(count);
    }
}