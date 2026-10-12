package Exams.Day11;
import java.util.function.Supplier;
//Generate curent date using supplier
public class Qb19 {
    public static void main(String[] args) {
        Supplier<String> currentDate=()->java.time.LocalDate.now().toString();
        System.out.println(currentDate.get());
    }
}
