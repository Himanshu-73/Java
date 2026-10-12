package DAY15;
// Thread //Pool 2
import java.util.concurrent.*;

public class b38 {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // Submit Callable task
        Future<Integer> f1= executor.submit(()->{
            try {System.out.println("Task Started...");
                Thread.sleep(2000);
                System.out.println("Task Completed");
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task interrupted");
            }
            return 10;
        });
        System.out.println("Waiting for result");
        System.out.println("Result :" + f1.get());
        executor.shutdown();
        
    }
}
