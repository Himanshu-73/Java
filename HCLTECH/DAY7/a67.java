package DAY7;
import java.util.LinkedList;
import java.util.Queue;

public class a67 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Rahul");
        queue.offer("Amit");
        queue.offer("Neha");
        System.out.println(queue);
        System.out.println("front:"+ queue.peek());
        System.out.println("Removed:"+queue.poll());
        System.out.println(queue);
    }    
}
