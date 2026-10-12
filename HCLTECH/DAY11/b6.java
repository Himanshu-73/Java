package DAY11;
//Predicate: wants to check or test something takes one input return boolean
import java.util.function.Predicate;
public class b6 {
    public static void main(String[] args) {
        Predicate<Integer> checkEven=number-> number%2==0;
        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(15));
    }
}
