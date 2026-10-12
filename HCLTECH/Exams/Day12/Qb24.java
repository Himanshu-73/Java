package Exams.Day12;
import java.util.*;
public class Qb24 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>(List.of(1,5,7,9,11));
        num.stream().map(n->n*n).forEach(System.out::println);
    }
    
}
