package Exams.Day5;
class Animal{
    void eat(){
        System.out.println("All eat");
    }
}
class Dog extends Animal{
    @Override 
    void eat(){
        System.out.println("Eats dog food");
    }
}
public class Q57 {
    public static void main(String[] args) {
        Animal obj= new Animal();
        Animal obj1= new Dog();
        obj.eat();
        obj1.eat();

    }
}
