package DAY13;
import java.util.*;

public class b27 {
    public static void main(String[] args) {
        List<String> Names= new ArrayList<>(Arrays.asList("Rahul","Raj","Rahim"));
        Names.stream().forEach(name->System.out.println(name));
    }    
}
