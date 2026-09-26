package Exams.Day3;

class Employee2{
int Bonus;
    int Salary;
int calcSalary(){
    return Salary + Bonus;
}
}
public class Q25 {
    public static void main(String[] args) {
        Employee2 e1=new Employee2();
        e1.Bonus=150;
        e1.Salary=2000;
        System.out.println("Total Salary is:");
        System.out.println(e1.calcSalary());
    }
}
