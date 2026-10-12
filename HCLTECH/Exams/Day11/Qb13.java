package Exams.Day11;
import java.util.List;
import java.util.function.Consumer;
public class Qb13 {
    public static void main(String[] args) {
        Consumer<String> print=str->System.out.println(List.of("HIMANSHU","SAHU","JAVA"));
        print.accept("HIMANSHU");
    }
    
}
