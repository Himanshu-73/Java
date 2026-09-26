package DAY2;
public class a16 {

    public static void main(String[] args) {
        System.out.println("program for continue and break");
        for(int i=1;i<=10;i++){
            if(i==7){
                break;
            }
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
