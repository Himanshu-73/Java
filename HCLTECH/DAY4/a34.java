package DAY4;
//super is used to refer to the parent class constructor.
class Parent3{
    Parent3(){
        super();
        System.out.println("Child class executed");
    }
}
class Child3 extends Parent3{
    Child3(){
        System.out.println("Child printed");
    }
}
public class a34 {
    public static void main(String[] args) {
        new Child3();
    }
}
