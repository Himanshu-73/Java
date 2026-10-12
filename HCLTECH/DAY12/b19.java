package DAY12;
import java.util.*;
import java.util.stream.Collectors;
public class b19 {
    public static void main(String[] args) {
        List<Integer> numbers =List.of(1,24,63,24,8);
        List<Integer> result=numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
