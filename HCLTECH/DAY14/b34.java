package DAY14;
//Precations of Null by Old Method
public class b34 {

    public static void main(String[] args) {
        User user = getUser();
        // Precaution by old method
        if (user != null) {
            Address address = user.address;
            if (address != null) {
                String city = address.city;
                if (city != null) {
                    System.out.println(city);
                } else {
                    System.out.println("City is Null");
                }
            } else {
                System.out.println("Address is null");
            }
        } else

        {
            System.out.println("User is Null");
        }
    }

    private static User getUser() {
        Address a = new Address();
        a.city = "Jaipur";

        User u = new User();
        u.address = a;
        return u;
    }

    static class User {
        public Address address;
    }

    static class Address {
        public String city;
    }
}