package DAY5;
class animal3{
    void eat(){
        System.out.println("1");
    }
}
class dog extends animal3{
    void bark(){
        System.out.println("2");
    }
}
class cat extends animal3{
    void meow(){
        System.out.println("2");
    } 
}
public class a40 {
    public static void main(String[] args) {
        dog obj=new dog();
        obj.eat();
        obj.bark();
        cat obj1=new cat();
        obj1.eat();
        obj1.meow();
    }
}
