package Exams.Day11;
import java.util.function.Predicate;
public class Qb2 {
    public static void main(String[] args) {
        Predicate<Integer> checkPositive=number-> number>0;
        System.out.println(checkPositive.test(5));
        System.out.println(checkPositive.test(-2));
    }
}
