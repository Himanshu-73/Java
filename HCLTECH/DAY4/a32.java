package DAY4;
class Animal{
    void display(){
        System.out.println("I am superclass");
    }
}
class Dog extends Animal{
    void display1(){
        System.out.println("The dog barks");
    }

}
public class a32 {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.display();
        obj.display1();
    }
}
