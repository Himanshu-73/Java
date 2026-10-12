package DAY18;

public class b63 {
    record student(int id,String name,int marks){
    }
    public static void main(String[] args) {
        student s1=new student(1,"Himanshu",90);
        student s2=new student(2,"Rohit",80);
        student s3=new student(3,"Amit",70);
        System.out.println(s1.id());
        System.out.println(s2.name());
        System.out.println(s3.marks());
    }
}
