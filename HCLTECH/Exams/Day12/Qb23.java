package Exams.Day12;
import java.util.*;
public class Qb23 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(List.of(25,50,75,100,150));
        numbers.stream().filter(x->x>=50).forEach(System.out::println);
    }
}
