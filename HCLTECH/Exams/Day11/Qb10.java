package Exams.Day11;
import java.util.function.Function;
public class Qb10 {
    public static void main(String[] args) {
        Function<String,Integer> length=str->str.length();
        System.out.println(length.apply("HIManshu"));
    }
    
}
