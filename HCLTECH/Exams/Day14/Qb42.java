package Exams.Day14;
import java.util.*;

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    Integer getMarks(){
        return marks;
    }
}
public class Qb42 {
    public static void main(String[] args) {
        List<Student> obj=Arrays.asList(new Student("Himanshu",85),new Student("Rahul",50),new Student("Amit",78));
        Optional<Student> obj2=obj.stream().max(Comparator.comparing(Student::getMarks));
        obj2.ifPresent(x->System.out.println(x.getName()));
    }

}
