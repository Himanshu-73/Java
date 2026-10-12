package DAY11;
import java.util.function.Supplier;

public class b9 {
    public static void main(String[] args) {
        Supplier<String> message =() -> "Welcome to java programming";
        System.out.println(message.get());
    }    
}
