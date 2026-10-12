package Exams.Day11;
import java.util.function.Predicate;
public class Qb3 {
    public static void main(String[] args) {
        Predicate<Integer> vote=number->number>18;
        System.out.println(vote.test(10));
        System.out.println(vote.test(20));
    }
}
