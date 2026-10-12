package DAY12;
import java.util.*;
import java.util.stream.*;
public class b18 {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>(List.of(5,10,15,25,20));
        Stream<Integer> obj=number.stream()
        .filter(s->s>10)
        .sorted();
        obj.forEach(System.out::println);
    }
}