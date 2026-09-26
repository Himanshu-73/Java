package DAY3;

public class a22 {
    public void get(String name1){
        System.out.println(name1 +" is Eating");
    }
    public void set(String name2){
        System.out.println(name2 + " is Dancing");
    }
    public static void main(String[] args) {
        a22 obj1=new a22();
        obj1.get("Himanshu");
        obj1.set("Himanshu");

        a22 obj2=new a22();
        obj2.get("Aarti");
        obj2.set("Aarti");
    }
}
