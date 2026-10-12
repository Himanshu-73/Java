package DAY11;
//Consumer: 
import java.util.function.Consumer;

public class b8 {
    public static void main(String[] args) {
        Consumer<String> printName=name-> System.out.println("Student :"+name);
        printName.accept("Himanshu");
        printName.accept("chandu");
    }
}
