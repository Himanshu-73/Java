package DAY5;
class Automobile1{
    void display1(){
        System.out.println("It's a range rover");
    }
}
interface WaterVehicle{
    default void display2(){
        System.out.println("It's water rover");
    }
}
class AmphVehicle extends Automobile1 implements WaterVehicle {
    public void display3() {
        System.out.println("Both");
    }
}

public class a42 {
    public static void main(String[] args) {
        AmphVehicle vehicle =new AmphVehicle();
        vehicle.display1();
        vehicle.display2();
        vehicle.display3();
    }
}
