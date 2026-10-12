package DAY12;
import java.util.*;
import java.util.stream.*;
public class b16 {
    public static void main(String[] args) {
        List<String> obj1=new ArrayList<>(List.of("Rahul","Raja","Ramesh","Suresh"));
        List<String> obj2=obj1.stream()
        .filter(s->s.startsWith("R"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(obj2);
        
    }
}
