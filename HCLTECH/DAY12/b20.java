package DAY12;
import java.util.*;
import java.util.stream.Collectors;
public class b20 {
    public static void main(String[] args) {
        List<Integer> numbers =List.of(10,20,30,40,50,60);
        List<Integer> result=numbers.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println(result);
    }
}
