package DAY5;

class animal2{
    void eat(){
        System.out.println("1");
    }
}
class mammal extends animal2{
    void dog(){
        System.out.println("2");
    }
}
class dog2 extends mammal{
    void fun(){
        System.out.println("3");
    }
}
public class a39 {
    public static void main(String[] args) {
        dog2 obj=new dog2();
        obj.eat();
        obj.dog();
        obj.fun();
    }
    
}
