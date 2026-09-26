package Exams.Day3;
//Student result calculation using class and object    


class Student3{
    String name;
    int marks1;
    int marks2;
    int calculate(){
        return (marks1+marks2)/2;
    }
}
public class Q30 {
    public static void main(String[] args) {
        Student3 obj = new Student3();
        obj.name = "Himanshu";
        obj.marks1 = 90;
        obj.marks2=80;
        System.out.println("Total marks:"+obj.calculate());
    }
}
