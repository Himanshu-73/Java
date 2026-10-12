package Exams.Day11;
import java.util.function.Supplier;

public class Qb16 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber=()->(int)(Math.random()*100);
        System.out.println(randomNumber.get());
    }

}
