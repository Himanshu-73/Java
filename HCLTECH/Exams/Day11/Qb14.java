package Exams.Day11;
import java.util.function.Function;
public class Qb14 {
    public static void main(String[] args) {
        Function<Double,Double> discount=price->price-(price*0.5);
        System.out.println(discount.apply(100.0));
        System.out.println(discount.apply(200.0));
    }
}
