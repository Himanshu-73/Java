package DAY5;
interface LandVehicle{
    default void display1(){
        System.out.println("It's a range rover");
    }
}
interface WaterVehicle{
    default void display2(){
        System.out.println("It's water rover");
    }
}
class AmphVehicle implements LandVehicle,WaterVehicle{
    public void display3() {
        System.out.println("Both");
    }
}

public class a41 {
    public static void main(String[] args) {
        AmphVehicle vehicle =new AmphVehicle();
        vehicle.display1();
        vehicle.display2();
        vehicle.display3();
    }
}
