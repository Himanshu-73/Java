package DAY18;

public class b56 {
    public static void main(String[] args) {
        String str= "  HELLO WORLD    ";
        String text ="JAVA Programming";
        String emptyString= "";
        String blankString= "   ";

        //1.Length()
        System.out.println("Length of str: "+str.length());
        System.out.println("Length of text: "+text.length());
        System.out.println("Length of emptyString: "+emptyString.length());
        System.out.println("Length of blankString: "+blankString.length());

        //2.isEmpty()
        System.out.println("Is emptyString empty? "+emptyString.isEmpty());
        System.out.println("Is blankString empty? "+blankString.isEmpty());

        //3. isBlank() - JAVA 11 feature
        System.out.println("Is emptyString blank? "+emptyString.isBlank());
        System.out.println("Is blankString blank? "+blankString.isBlank());

        //4.charAt()
        System.out.println("4.CharAt(2):"+text.charAt(2));
        System.out.println("4.CharAt(5):"+str.charAt(5));

        //5. codePointat() -> return unicode 
        System.out.println("5.codePointAt(2):"+text.codePointAt(1));

        //6.substring()
        System.out.println("6.substring(5):"+text.substring(5));
        System.out.println("6.substring(2,5):"+str.substring(2,6));

        //7.equals() - > returns boolean for exact match
        System.out.println("7.equals(): "+text.equals("JAVA Programming"));

        //8.equalsIgnoreCase() -> returns boolean for exact match ignoring case
        System.out.println("8.equalsIgnoreCase(): "+text.equalsIgnoreCase("java programming"));

        //9.compareTo() -> returns int value for lexicographical comparison
        System.out.println("9.compareTo(): "+text.compareTo("JAVA Programming"));

        //10.compareToIgnoreCase()
        System.out.println("10.compareToIgnoreCase(): "+text.compareToIgnoreCase("java programming"));

        //11.contains() -> returns boolean if substring is present
        System.out.println("11.contains(): "+text.contains("JAVA"));

        //12.startsWith() -> returns boolean if string starts with given substring
        System.out.println("12.startsWith(): "+text.startsWith("JAVA"));

        //13.endsWith() -> returns boolean if string ends with given substring
        System.out.println("13.endsWith(): "+text.endsWith("Programming"));

        //14.indexOf() -> returns index of first occurrence of substring
        System.out.println("14.indexOf(): "+text.indexOf("Programming"));

        //15.lastIndexOf() -> returns index of last occurrence of substring
        System.out.println("15.lastIndexOf(): "+text.lastIndexOf("a"));

        //16.toUpperCase() -> convert to uppercase
        System.out.println("16.toUpperCase(): "+text.toUpperCase());

        //17.toLowerCase() -> convert to lowercase
        System.out.println("17.toLowerCase(): "+text.toLowerCase());

        

    }
}
