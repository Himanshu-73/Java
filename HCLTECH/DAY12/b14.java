package DAY12;
import java.util.*;
import java.util.stream.*;
public class b14 {
    public static void main(String[] args) {
        List<Integer> obj =new ArrayList<>(List.of(1,5,10,20));
        Stream<Integer> number=obj.stream()
        .filter(x->x>10)
        .map(x->x*10);
        number.forEach(System.out::println);
    }    
}
