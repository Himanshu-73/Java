package DAY16;
//Java cached thread Pool Example
//It creates threads as needed and reuses previously created threads when they become available
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class b51 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=1;i<=10;i++){
            int taskNumber=i;
            executor.submit(() -> {
                System.out.println("Task "+ taskNumber + " executed by "
                 + Thread.currentThread().getName());
            try{
                Thread.sleep(7000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
    }
    executor.shutdown();
    }
}
