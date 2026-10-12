package DAY15;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyTask implements Runnable{
    String name; 
    MyTask(String name){
        this.name=name;
    }
    @Override 
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name +":"+i);
        }
    }
}
public class b36 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new MyTask("Thread A"));
        executor.execute(new MyTask("Thread B"));
        executor.shutdown();
    }
}
