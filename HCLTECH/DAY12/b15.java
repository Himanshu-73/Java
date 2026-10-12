package DAY12;
import java.util.*;
import java.util.stream.*;
public class b15 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<>(List.of("Himanshu","Sahu"));
        Stream<String> name=obj.stream();
        name.filter(s->s.length()>5).map(String::toUpperCase)
        .forEach(System.out::println);
    }
}
