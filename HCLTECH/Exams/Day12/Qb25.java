package Exams.Day12;
import java.util.*;
public class Qb25 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<>(List.of("HImanshu","Rohan","SureSH"));
        obj.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
