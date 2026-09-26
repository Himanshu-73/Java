package DAY5;
class animal1{
    void eat(){
        System.out.println("Animals eat to live");
    }
    void sound(){
        System.out.println("Make noise");
    }
}
class dog1 extends animal1{
    void sound(){
        super.sound();
        System.out.println("Dog Barks");
    }
}
public class a38 {
    public static void main(String[] args) {
        animal1 obj =new animal1();
        dog1 obj1 =new dog1();
        obj.eat();
        obj1.sound();

    }
}