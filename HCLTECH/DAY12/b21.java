package DAY12;
import java.util.*;
import java.util.stream.Collectors;
public class b21 {
    public static void main(String[] args) {
        List<List<String>> listofLists=List.of(List.of("Student","Surname","Language"),List.of("Himanshu","Sahu","Python"),List.of("Rahul","Raja","Java"),List.of("Ramesh","Sharma","C++"));
        Set<String> intermediateResults=new LinkedHashSet<>();
        List<String> result=listofLists.stream()
        .flatMap(List::stream)
        .filter(s->s.startsWith("R"))
        .map(String::toUpperCase)
        .distinct()
        .sorted()
        .peek(intermediateResults::add)
        .collect(Collectors.toList());
        System.out.println("Intermediate Results"+intermediateResults);
        System.out.println("Final result"+result);

    }
}
