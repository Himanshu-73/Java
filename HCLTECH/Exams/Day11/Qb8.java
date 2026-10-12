package Exams.Day11;
import java.util.function.Function;
public class Qb8 {
    public static void main(String[] args) {
        Function<String,String> toup=str->str.toUpperCase();
        System.out.println(toup.apply("himanshu"));
        System.out.println(toup.apply("sahu"));
    }
}
