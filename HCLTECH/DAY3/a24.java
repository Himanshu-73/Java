package DAY3;

public class a24 {
    int rollno;
    String name;
    a24(int r, String n){
        rollno=r;
        name=n;
    }
    public void display(){
        System.out.println("ROll No. "+ rollno);
        System.out.println("Name "+ name);
    }
    public static void main(String[] args) {
        a24 obj=new a24(101,"Himanshu");
        obj.display();
    }
}
