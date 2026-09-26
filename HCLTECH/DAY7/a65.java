package DAY7;
import java.util.*;
public class a65 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Java"));
        System.out.println(map.size());
    }
}
