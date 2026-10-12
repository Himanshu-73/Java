package DAY11;
//Function<T,R> Purpose: Function is used when you wna tot take an input and produce a result.
//Takes one input

import java.util.function.Function;
public class b7 {
    public static void main(String[] args) {
        Function<Integer,Integer> square=number-> number * number;
        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}
