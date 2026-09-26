package Exams.Day3;

class Circle{
    int radius;
    double calcArea(){
        return Math.PI*radius*radius;
    }
    double calcPeri(){
        return 2*3.14*radius;
    }
}
public class Q27 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=4;
        System.out.println("Area"+c1.calcArea()+" "+"Perimeter:"+c1.calcPeri());
    }
}
