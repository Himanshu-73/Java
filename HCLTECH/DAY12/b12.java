package DAY12;

//!st method
import java.util.*;
import java.util.stream.*;
public class b12 {
    public static void main(String[] args) {
        //List<integer> obj= new ArrayList<>();
        //obj.add(1);
        //obj.add(2);
        //System.out.println(obj);
        List<Integer> obj = new ArrayList<>(List.of(1,2,3,4,5,6));
        Stream<Integer> number =obj.stream();
        number=number.filter(x->x>3);
        number=number.map(x->x*5);
        number.forEach(System.out::println);
        }
    
}
