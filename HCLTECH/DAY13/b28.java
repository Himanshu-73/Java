package DAY13;
import java.util.Arrays;
import java.util.List;
public class b28 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,20,30,40);
        int min=numbers.stream().filter(n->n>25).min (Integer::compareTo).orElse(0);
        System.out.println(min);
    }
}
