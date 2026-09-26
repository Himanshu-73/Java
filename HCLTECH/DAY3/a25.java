package DAY3;

public class a25 {
    int age;
    String name;
    a25(int a, String n){
        age=a;
        name=n;
    }
    void display(){
        System.out.println("Name is "+ name);
        System.out.println("Age "+age);
    }
    public static void main(String[] args) {
        a25 obj=new a25(21,"Himanshu");
        obj.display();
    }
    a25(a25 obj){
        age=obj.age;
        name=obj.name;
    }
}
