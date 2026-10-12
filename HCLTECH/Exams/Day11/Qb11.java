package Exams.Day11;
import java.util.function.Consumer;
public class Qb11 {
    public static void main(String[] args) {
        Consumer<String> print=str->System.out.println(str);
        print.accept("HIMANSHU");
    }
}
