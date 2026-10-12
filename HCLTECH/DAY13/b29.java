package DAY13;
import java.util.*;
public class b29 {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(12,13,14,15,16,17);
        Optional<Integer> result=lst.stream().filter(n->n>15).findFirst();
        System.out.println(result.orElse(0));
    }
}
