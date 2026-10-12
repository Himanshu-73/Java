package DAY13;
import java.util.*;
public class b23 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(10,20,30,40,50));  //resizable
        // List <Integer> numbers =Arrays.asList(10,20,30,40,50);  fized size list
        long Count=list.stream().filter(n->n>25).count();
        System.out.println("Count:"+Count);

    }
    
}
