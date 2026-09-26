package Exams.Day3;

class Rectangle{
    int width;
    int height;

    int calcArea(){
        return width*height;
    }
}
public class Q26 {
    public static void main(String[] args) {
        Rectangle s1= new Rectangle();
        s1.width=4;
        s1.height=5;
        System.out.println("Area:"+s1.calcArea());
    }
}


