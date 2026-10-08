import java.util.concurrent.*;
public class Callable_Threads{
public static void main(String[]args)
throws Exception{
ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<Integer> bill = () -> {
        int price = 500;
        int delivery = 50;
        return price + delivery;
        };
    Future<Integer> result = service.submit(bill);
    System.out.println("total bill = " +result.get());
    service.shutdown();
}
}