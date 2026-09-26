package Exams.Day4;

public class Q41 {
    int id;
    String Name;
    Q41(){
        this(10);
        System.out.println("This should execute later");
    }
    Q41(int id){
        System.out.println("This should execute first");
    }
    public static void main(String[] args) {
        Q41 obj=new Q41();
        System.out.println("Main always last");
    }
