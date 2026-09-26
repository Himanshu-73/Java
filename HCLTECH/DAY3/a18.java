package DAY3;
public class a18 {
    int age;
    String name;

    void display() {
        System.out.println("Name"+name);
        System.out.println("age"+ age);
        System.out.println();
    }
    public static void main(String[] args) {
        a18 s1=new a18();
        s1.name="Himanshu";
        s1.age=21;

        a18 s2=new a18();
        s2.name="Aarti";
        s2.age=25;
        s2.display();
        s1.display();
    }
    
}
