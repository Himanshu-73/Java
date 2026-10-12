package Exams.Day11;
import java.util.function.Predicate;
public class Qb5 {
    public static void main(String[] args) {
        Predicate<String> morethan5=str-> str!=null & str.length()>5;
        System.out.println(morethan5.test("HIMANSHU"));
        System.out.println(morethan5.test("SAHU"));
    }
}
