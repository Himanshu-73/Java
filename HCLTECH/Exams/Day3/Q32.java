package Exams.Day3;

class Student5{
    String Name;
    int age;

    Student5(String name, int age){
        this.Name = name;  //this is used if name is same as parameter name
        this.age = age;
        System.out.println("Parameterized constructor called");
    }
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
    }
}
public class Q32 {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Himanshu", 21);
        s1.display();
    }
}
