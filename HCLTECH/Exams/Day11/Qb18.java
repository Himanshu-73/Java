package Exams.Day11;
import java.util.function.Supplier;
public class Qb18 {
    public static void main(String[] args) {
        Supplier<String> user=()->("Default");
        System.out.println(user.get());
    }
}
