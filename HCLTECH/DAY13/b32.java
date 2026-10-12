package DAY13;
import java.util.*;
public class b32 {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>(List.of(1,2,3,4,5));
        lst.stream().filter(n->n>3).map(n->n*2)
        //lst.parallelStream().filter(n->n>3).map(n->n*2).sorted().forEach(System.out::println);
    }
    
}
