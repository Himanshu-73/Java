package Exams.Day3;

class Student2{
    int age;
    String name;
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
    }
}
public class Q23 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        s1.name="Himanshu";
        s1.age=21;
        s1.display();

    }
}
