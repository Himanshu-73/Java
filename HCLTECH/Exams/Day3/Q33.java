package Exams.Day3;
class Student5{
    String name;
    int age;
    Student5(){
        this.name="unknown";
        this.age=0;
    }
    Student5(String name){
        this.name=name;
        this.age=0;
    }
    Student5(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Q33 {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Himanshu", 21);
        s1.display();
    }
}
