package DAY13;
import java.util.*;
import java.util.stream.Collectors;
public class b22 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,20,30,40);
        List<Integer> result=numbers.stream().filter(n->n>25).collect(Collectors.toList());
        System.out.println(result);
        //numbers.stream().filter(n->n>25).collect(Collectors.toList()).forEach(System.out::println);
     }
}
