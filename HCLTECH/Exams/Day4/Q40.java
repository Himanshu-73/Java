package Exams.Day4;
//Constructor chaining
public class Q40 {
    int id;
    String Name;
    Q40(){
        this(10);
        System.out.println("This should execute later");
    }
    Q40(int id){
        System.out.println("This should execute first");
    }
    public static void main(String[] args) {
        Q40 obj=new Q40();
        System.out.println("Main always last");
    }

}
