package Exams.Day3;

class Student {
    int age;
    String name;
}
public class Q21 {
    public static void main(String[] args) {

        Student obj = new Student();

        obj.name = "Himanshu";
        obj.age = 21;

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
