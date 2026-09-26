package DAY8;
//
class Animal{
    void sound(){
        System.out.println("Sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
}
class Test<T extends Animal>{
    T animal;
    Test(T animal){
        this.animal=animal;
    }
    void display(){
        animal.sound();
    }
}
public class a79 {
    public static void main(String[] args) {
        Test<Dog> obj=new Test<>(new Dog());
        obj.display();
    }
    
}
