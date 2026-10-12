package DAY18;

public class b60 {
    public static void main(String[] args) {
        String language="Java";
        String type= switch(language){
            case "Java","C++"->{
                System.out.println("JAVA != JavaScript");
                yield "Compiled";
            }
            case "Python","JavaScript"->"Interpreted";
            default->"Unknown";
        };
        System.out.println("Language: " + language);
        System.out.println("Type: " + type);
    }
}
