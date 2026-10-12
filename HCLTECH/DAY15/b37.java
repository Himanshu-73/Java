package DAY15;
//Thread //Pool 1
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class b37 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //ExecutorService- Class
        //executor - Refernce Var.
        //Executors-Utility Class
        for(int i=1;i<=5;i++){
            int TaskId=i;
            executor.execute(()-> {
                System.err.println("Task "+ TaskId + " is performed by"+ Thread.currentThread().getName());
            });
        }
    }
    
}
