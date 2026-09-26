package Exams.Day4;

public class Q38 {
    int num=10;
    void change(int num){
        System.out.println("The local var is:"+num);
        System.out.println("The value of global variable is:"+this.num);
    }
    public static void main(String[] args) {
        Q38 obj=new Q38();
        obj.change(15);
    }
}
