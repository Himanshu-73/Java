package Exams.Day3;
class Car{
    String model;
    int year;
    double price;

    void displayDetails(){
        System.out.println("Car Name:"+model);
        System.out.println("Year:"+year);
        System.out.println("Price:"+price);
    }
}
public class Q29 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.model="Honda";
        c1.year=1995;
        c1.price=20000;
        System.out.println("Avialable Cars");
        c1.displayDetails();
    }
}
