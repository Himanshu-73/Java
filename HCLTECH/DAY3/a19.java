package DAY3;

public class a19 {
    int rollNo;
    String Name;
    double marks;
    void DisplayStudent(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+Name);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        a19 s1=new a19();
        s1.rollNo=101;
        s1.Name="Himanshu";
        s1.marks=90.5;
        s1.DisplayStudent();
    }
}
