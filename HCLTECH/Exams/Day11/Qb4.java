package Exams.Day11;
import java.util.function.Predicate;
public class Qb4 {
    public static void main(String[] args) {
        Predicate<Integer> div=number-> number%5==0;
        System.out.println(div.test(10));
        System.out.println(div.test(19));
    }
}
