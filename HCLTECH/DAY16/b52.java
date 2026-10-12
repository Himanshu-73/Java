package DAY16;
//Java Single Thread Pool Example 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class b52 {
    public static void main(String[] args){
        ExecutorService executor =Executors.newSingleThreadExecutor();
        //Submit task1 
        executor.submit(()->{
            System.out.print("Task 1 is executed by: " + Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Task 1 completed");
        });
        //Submit Task 2
        executor.submit(()-> {
            System.out.println("Task 2 executed by: "
                +Thread.currentThread().getName());
            System.out.println("Task 2 Completed");
        });
        executor.shutdown();
    }
}

