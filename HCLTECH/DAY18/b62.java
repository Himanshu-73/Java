package DAY18;

public class b62 {
    public static void main(String[] args) {
        String message1="""
                Hello Students
                Welcome to java
                """;
        System.out.println(message1);
        //Text block with JSON
        String json="{\n" +
                "  \"name\": \"Himanshu\",\n" +
                "  \"age\": 22,\n" +
                "  \"city\": \"Delhi\"\n" +
                "}";
        System.out.println(json);
        //Text block with HTML
        String html="""
                <html>
                    <head>
                        <title>My Page</title>
                    </head>
                    <body>
                        <h1>Hello Students</h1>
                        <p>Welcome to java</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
