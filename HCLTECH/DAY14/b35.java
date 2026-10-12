//Precations of Null by Optional
package DAY14;

import java.util.Optional;
public class b35 {
    
    public static void main(String[] args) {
        // User user = getUser();
        Optional<User> user = getUser();
    
        user.map(x -> x.adress)
                .map(y -> y.city)
                .ifPresent(System.out::println);
    }
    
    private static Optional<User> getUser() {
        Address a = new Address();
        a.city = "Jaipur";
    
        User u = new User();
        u.adress = a;
        // return u;
        return Optional.of(u);
    }
    
    static class User {
        public Address adress;
    }
    
    static class Address {
        public String city;
    }
}





