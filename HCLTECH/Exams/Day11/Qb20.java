package Exams.Day11;
import java.util.function.*;
public class Qb20 {
    public static void main(String[] args) {
        Predicate<Integer> result=number->number>33;
        System.out.println(result.test(35));
        Function<Integer,String> grades=number->number>60?"A Grade":"B Grade";
        System.out.println(grades.apply(50)); 
        Consumer<String> display=dis->System.out.println(dis);
        display.accept("You have passed ths semester");
        Supplier<Integer> random=()->(int)(Math.random()*10000);
        System.out.println("Loye you "+ random.get());
    }
}
