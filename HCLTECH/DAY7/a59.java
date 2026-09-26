package DAY7;
import java.util.ArrayList;
public class a59 {
    public static void main(String args[]){
        ArrayList<String> students=new ArrayList<>();
        students.add("Rahul");
        students.add("Amit");
        students.add("Neha");
        students.add("Rahul");
        System.out.println(students);
        System.out.println("First Student:"+students.get(0));
        students.set(1,"Ravi");
        students.remove("Neha");
        System.out.println("After Modification"+ students);
    }
}