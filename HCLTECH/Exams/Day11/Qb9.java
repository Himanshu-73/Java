package Exams.Day11;
import java.util.function.Function;
public class Qb9 {
    public static void main(String[] args) {
        Function<Integer,Double> bonus=number->number*1.10;
        System.out.println(bonus.apply(1200));
    }
    
}
