package DAY13;
import java.util.*;

public class b30 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(12,15,24,32,40,45,27);
        Optional<Integer> findany= numbers.stream().filter(n->n>32).findAny();  //Still selects 40(the first one)
        System.out.println(findany.orElse(-1));
    }
    
}
