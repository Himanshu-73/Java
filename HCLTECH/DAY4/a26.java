package DAY4;
// local or global variable this resoltuion
public class a26 {
    int num=20;  //Reference var
    void test(int num){
        System.out.println("The value of global var is:"+this.num);
        System.out.println(("The value of the var is:"+num));
    }
    public static void main(String[] args) {
        a26 obj=new a26();
        obj.test(30);
    }

}
