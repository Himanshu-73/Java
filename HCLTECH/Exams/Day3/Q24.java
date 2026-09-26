package Exams.Day3;

class Employee{
    int id;
    String name;

    void displayInfo(){
        System.out.println("ID:"+id +" "+"Name:"+name);
    }
}
public class Q24 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=101;
        e1.name="Himanshu";
        e1.displayInfo();
    }
}
