package DAY8;
//Bounded types
//Sometimes we dont wat  agenric type to accept all types of data. We can restrict the type of data that can be passed to a generic type by using bounded types. Bounded types are specified using the extends keyword. For example, if we want to create a generic class that only accepts Number and its subclasses, we can use the following syntax:
public class a78<T extends Number> {
    public static <T extends Number> double multiply(T a, T b) {
        double n= a.doubleValue() * b.doubleValue();
        return n;
    }
    public static void main(String[] args) {
        System.out.println(multiply(10, 20));
        System.out.println(multiply(10.5, 20.5));
    }
}
