package DAY12;
import java.util.*;
import java.util.stream.*;
public class b17 {
    public static void main(String[] args) {
        List<List<String>> listoflist=new ArrayList<>(List.of(List.of("Java","Python"),List.of("Scala","C++"),List.of("Linux","Java")));
        List<String> result= listoflist.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
        System.out.println(result);
        }
}
