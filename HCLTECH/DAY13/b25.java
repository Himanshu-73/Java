package DAY13;
import java.util.*;
import java.util.stream.Collectors;
class Student{
    String name;
    String department;

    Student(String name, String department){
        this.name=name;
        this.department=department;
    }
    public String toString(){
        return name;
    }
}

public class b25 {
    public static void main(String[] args) {
        List<Student> students=Arrays.asList(
            new Student("Rahul","AI"),
            new Student("Amit","CSE"),
            new Student("Priya","AI")
        );
        Map<String,List<Student>> result=
            students.stream().collect(Collectors.groupingBy(s->s.department));
            System.out.println(result);
    }
}
