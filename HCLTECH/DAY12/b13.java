package DAY12;
import java.util.*;

//2nd method
public class b13 {
    public static void main(String[] args) {
        List<Integer> obj= new ArrayList<>(List.of(1,3,5,6,9,12,15,16));
        obj.stream()
        .filter(x->x>10)
        .map(x->x*2)
        .forEach(System.out::println);

    }
    
}
