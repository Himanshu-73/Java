package Exams.Day12;
import java.util.*;
import java.util.stream.*;
public class Qb21 {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>(List.of(1,2,5,7,9,1,24,35,21,54));
        Stream<Integer> obj=number.stream();
        obj.forEach(System.out::println);
    }
    
}
