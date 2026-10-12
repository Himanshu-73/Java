package Exams.Day12;
import java.util.*;
import java.util.stream.*;
public class Qb26 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>(List.of("Himanshu","Hary","Suresh"));
        List<String> result=name.stream().filter(x->x.startsWith("H")).collect(Collectors.toList());
        System.out.println(result);
    }
}
