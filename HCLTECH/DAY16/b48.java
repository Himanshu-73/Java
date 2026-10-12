package DAY16;
import java.sql.Time;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.*;
public class b48 {
    public static void main(String[] args) {
        
        //1. Core pool size
        int corepoolsize=2;
        //2. Maximum pool size
        int maximumpoolsize=4;
        //3. Keep alive time
        long keepalivetime=10;
        //4. Time unit
        TimeUnit unit=TimeUnit.SECONDS;
        //5. Work queue
        BlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<>(2);
        //6. Thread factory
        ThreadFactory threadFactory= Executors.defaultThreadFactory();
        //7. Rejected execution handler
        RejectedExecutionHandler handler=new ThreadPoolExecutor.AbortPolicy();
        try(//Create ThreadPoolExecutor
            ThreadPoolExecutor executor=new ThreadPoolExecutor(corepoolsize,
                maximumpoolsize,
                keepalivetime,
                timeUnit,
                workQueue,
                threadFactory,
                handler))
            {
                catch(Exception e){
                    System.out.println("Exception: "+e.getMessage());
            }
    }
    
}
