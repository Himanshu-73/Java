package DAY18;
//Sealed || Non Sealed || Final
sealed class Car permits auto, bus{
    void display(){
        System.out.println("I am Autobot");
    }
}
non-sealed class auto extends Car{
    void get(){
        System.out.println("I am Auto Rikshaw");
    }
}
final class bus extends Car{ 
    void show(){
        System.out.println("I am Bus");
    }
}
public class b67 {
    public static void main(String[] args) {
        auto a = new auto();
        a.display();
        a.get();
        bus b = new bus();
        b.display();
        b.show(); 
    }
}