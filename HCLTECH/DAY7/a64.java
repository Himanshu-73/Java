package DAY7;
import java.util.HashMap;
public class a64 {
    public static void main(String[] args) {
        HashMap<Integer,String>students=new HashMap<>();
        students.put(101,"Himanshu");
        students.put(102,"Priyanshu");
        students.put(103,"Sudanshu");
        students.put(101,"Key repeat");
        students.put(104,"Himanshu");
        students.put(102,"Priyanshu");
        System.out.println(students);
        System.out.println("Students 101:"+students.get(101));
        System.out.println("Student 102 Contains key:"+students.containsKey(102));
        students.remove(103);
        System.out.println(students);
    }
}
   
