package DAY4;
//Current class instance as Parameter to the constructor
public class a31 {
    int rollNo;
    String name;
    a31(int rollNo, String name){
        this.rollNo=rollNo;
        this.name =name;
    }
    void display(a31 obj){
        System.out.println("Name is :"+ name);
        System.out.println("ROll No.:"+rollNo);
    }
    void show(){
        display(this);  //Passing curent object as parameter
    }
    public static void main(String[] args) {
        a31 obj=new a31(101, "Himanshu");
        obj.show();
    }
}
