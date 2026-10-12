package Exams.Day11;
import java.util.function.Function; 
public class Qb7 {
    public static void main(String[] args) {
        Function<Integer,Integer> square=num->num*num;
        System.out.println(square.apply(5));
        System.out.println(square.apply(8));
    }
}
