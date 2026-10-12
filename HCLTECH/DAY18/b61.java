package DAY18;
enum Level{
    LOW,MEDIUM,HIGH;
}
public class b61 { 
    public static void main(String[] args) {
        Level level = Level.HIGH;
        String result = switch(level){
            case LOW -> "Low Level";
            case MEDIUM -> "Medium Level";
            case HIGH -> "High Level";
        };
        System.out.println(result);
    }
}
