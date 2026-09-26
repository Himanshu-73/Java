package DAY7;
import java.util.*;
public class a69 {
    public static void main(String[] args) {
        HashMap<Integer,String> students= new HashMap<>();
        students.put(101, "rahul");
        students.put(102, "Himanshu");
        students.put(103,"Neha");
        for(Integer key:students.keySet()){
            System.out.println(key);
        }
        for(String value: students.values()){
            System.out.println((value));
        }
        for(Map.Entry<Integer,String> entry: students.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
