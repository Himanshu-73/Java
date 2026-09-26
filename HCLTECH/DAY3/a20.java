package DAY3;

public class a20 {
    String voice;
    void sound(){
        System.out.println("Dog Barks");
    }
    public static void main(String[] args) {
        a20 obj=new a20();
        obj.sound();
        obj.voice="meaw";
        System.out.println("Cat Sound: "+obj.voice);
    }
}
