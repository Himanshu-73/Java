package DAY7;

import java.util.LinkedList;

public class a60 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Pune");
        System.out.println(cities);
        cities.removeFirst();
        cities.removeLast();
        System.out.println(cities);
    }
}
