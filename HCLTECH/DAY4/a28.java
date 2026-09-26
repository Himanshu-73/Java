package DAY4;
// multiple function this
public class a28 {
    void m1(){
        System.out.println("M1 Initialized");
        m2(); // or this.m2() both will owrk same in newer java
    }
    void m2(){
        System.out.println("M2 Initialized");
    }
    public static void main(String[] args) {
        a28 obj= new a28();
        obj.m1();
    }
}
