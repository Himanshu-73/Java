package Exams.Day3;

class Student {
    int age;
    String name;
}
public class Q22 {
    public static void main(String[] args) {
         Student s1=new Student();
         Student s2=new Student();
         s1.age=21;
         s1.name="Himanshu";

         s2.age=25;
         s2.name="Aarti";
         System.out.println(s1.name);
         System.out.println(s1.age);
         System.out.println(s2.age);
         System.out.println(s2.name);
    }
}
