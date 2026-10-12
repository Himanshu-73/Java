package Exams.Day11;
import java.util.function.Supplier;
public class Qb17 {
    public static void main(String[] args) {
        Supplier<String> print=()->("Welcome");
        System.out.println(print.get());
    }
}
