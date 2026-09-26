package DAY7;
import java.util.PriorityQueue;
//Elements are processed acc to priority not a normal FIFO queue
public class a68 {
    public static void main(String[] args) {

    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.offer(50);
    pq.offer(10);
    pq.offer(30);
    pq.offer(20);
    while(!pq.isEmpty()){
        System.out.println(pq.poll());
    }
    }
}

