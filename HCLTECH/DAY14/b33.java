package DAY14;
import java.util.Optional;
public class b33 {
    public static void main(String[] args) {
        //Optional.of-> value must return not null
        Optional<String> obj =Optional.of("Himanshu");
        System.out.println(obj);

        //ifPresent() -> executes action if value exists
        obj.ifPresent(System.out::println);
        
        //Optional.ofNullable -Allows Null
        Optional<String> obj2=Optional.ofNullable(null);
        System.out.println(obj2);

        //Get() - Value Retrieval
        Optional<String> obj3 = Optional.of("Raj");
        System.out.println(obj3.get());

        //Empty Optional
        Optional<String> obj4=Optional.ofNullable("Raju");
        System.out.println(obj4.isPresent());
        Optional<String> obj5=Optional.ofNullable(null);
        System.out.println(obj5.isPresent());

        //orElse - Provides a Default value
        Optional<String> obj6 = Optional.ofNullable(null);
        System.out.println(obj6.orElse("Hari"));
        Optional<Integer> obj7 = Optional.ofNullable(null);
        System.out.println(obj7.orElse(5));
    }
}
