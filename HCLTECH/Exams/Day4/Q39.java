package Exams.Day4;

public class Q39 {
    int id=101;
    String name="Himanshu";

    void update(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
    public static void main(String[] args) {
        Q39 obj=new Q39();
        obj.update(102,"Himanshi");
    }
    
}
