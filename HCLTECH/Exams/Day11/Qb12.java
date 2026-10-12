package Exams.Day11;
import java.util.function.Consumer;

public class Qb12 {
    public static void main(String[] args) {
        Consumer<String> emp=name->System.out.println(name);
        emp.accept("HIMANSHU");
    }   
}
