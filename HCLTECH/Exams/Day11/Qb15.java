package Exams.Day11;
import java.util.function.Function;
public class Qb15 {
    public static void main(String[] args) {
        Function<Integer,String> status=num->num>33?"Pass":"Fail";
        System.out.println(status.apply(35));
    }   
}
