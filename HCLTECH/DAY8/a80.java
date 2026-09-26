package DAY8;

interface Printable(){
    void print();
}
class Person{
    void display(){
        System.out.println("Person");
    }
}
class Demo<T extends Person & Printable>{
    T obj;
    Demo(T obj){
        this.obj=obj;
    }
    void show(){
        obj.display();
        obj.print();
    }
}
class  Student extends Person implements Printable{
    @Override  
}
public class 180 {
    
}
