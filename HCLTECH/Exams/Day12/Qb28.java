package Exams.Day12;
import java.util.*;
import java.util.stream.*;
public class Qb28 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>(List.of(2,0,1,0,2,0,1,3));
        List<Integer> res=num.stream().distinct().collect(Collectors.toList());
        System.out.println(res);
    }
}
