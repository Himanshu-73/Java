package Exams.Day3;
//Default Constructor
// multiple paramters constructor and multiple constructor can be formed in a class
class Student4{
    int age;
    String name;

    Student4(){
        System.out.println("Default Consturctor called");
        age=18;
        name="name";
    }
    void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
}
public class Q31 {
    public static void main(String[] args) {
        Student4 obj=new Student4();
        obj.display();
    }
}
