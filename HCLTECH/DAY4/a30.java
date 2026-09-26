package DAY4;
//Callback and self reflection
public class a30 {
    void m1(){
        m2(this); // this keyword will work as an argument
        System.out.println("1st Method Printed");
    }
    void m2(a30 s){  // Refernce of object will also get printed
        m3(this);
        System.out.println("2nd method printed"+s);
    }
    void m3(a30 i){
        System.out.println("3rd method printed"+ i);
    }
    public static void main(String[] args) {
        a30 obj=new a30();
        obj.m1();
    }
}
//1st multiple function
//2nd delared method onto this