package Exams.Day11;
import java.util.function.Function;
public class Qb6 {
    public static void main(String[] args) {
        Function<Integer, Double> ctof=number->number*1.8+32;
        System.out.println(ctof.apply(0));
        System.out.println(ctof.apply(100));
    }
}
