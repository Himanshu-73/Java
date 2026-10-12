package DAY18;
import java.util.*;
record Student(int id, String name){

}
public class b66 {
    public static void main(String[] args) {
        List<Student> students=List.of(
            new Student(101,"Himanshu"),
            new Student(102,"Amit"), 
            new Student(103,"Priya"));
        for(Student s: students){
            System.out.println(s.id() +" "+s.name());
        }
    }
}
