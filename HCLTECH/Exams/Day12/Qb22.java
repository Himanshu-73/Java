package Exams.Day12;
import java.util.*;
import java.util.stream.*;
public class Qb22 {
    public static void main(String[] args) {
        
        List<Integer> numbers=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,96,59,34,15));
        Stream<Integer> obj=numbers.stream();
        obj=obj.filter(x->x%2==0);
        obj.forEach(System.out::println);
    }
}
