package DAY18;

public class b57 {
    public static void main(String[] args) {
        //Better switch with arrow function
        int day=2;
        String result=switch(day){
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            default->"Invalid day";
        };
        /* Switch case example
        int day=2;
        String result;
        switch(day){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3: 
            result="Wednesday";
                break;
            default:
                result="Invalid day";
        }*/
        System.out.println(result);
    }
}
