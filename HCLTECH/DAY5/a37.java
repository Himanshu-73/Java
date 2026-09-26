package DAY5;
class animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends animal{
    @Override 
    void sound(){
        System.out.println("Dog Barks");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("Cat meow");
    }
}
public class a37 {
    public static void main(String[] args) {
        animal obj =new animal();
        animal obj1 =new dog();
        animal obj2 =new cat();
        obj.sound();
        obj1.sound();
        obj2.sound(); 
    }
}
