package Exams.Day12;
import java.util.*;
import java.util.stream.*;
public class Qb27 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>(List.of(4,8,12,16,20,25));
        List<Integer> res=num.stream().filter(x->x>10).map(x->x*2).collect(Collectors.toList());
        System.out.println(res);
    }
}
