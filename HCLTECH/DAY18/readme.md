java 9-21  -> Jshell, module

JAVA 10 - Local Variables 
        -> var is new feature in java 10 which allows to declare local variables without specifying the type explicitly. 
        -> Adds type inference to declaration of local variables with initializers.
        -> can be used for / for each as index.
        -> can't be initalized with null, lambda expression, method reference, array initializer.
        -> var is not a keyword, it is a reserved type name.

JAVA 11 - New features in Java 11 include:
        -> String methods: 
         isBlank()-> Checks if string is blank or not,
         lines()-> returns a stream of lines extracted from the string, allowing for easy processing of multi-line text.
         strip()-> removes all kind of whitespace, stripLeading(), stripTrailing(),
        repeat()-> repeats the string a specified number of times.

JAVA 14 - Switch Expressions (Preview featurein JAVA 12 Standard feature in JAVA 14)
        -> Switch expressions allow you to use the switch statement as an expression, which can return a value. 
        -> This feature simplifies the syntax and makes it easier to work with switch statements.
        -> The new syntax uses the "->" arrow operator or colon syntax instead of the traditional "case" keyword.

        Problems in traditional switch statements:
        -> Fall-through behavior: In traditional switch statements, if you forget to include a break statement, the execution will "fall through" to the next case, which can lead to unexpected behavior.
        -> Verbose syntax: Traditional switch statements can be verbose.
        -> Limited return values: Traditional switch statements cannot return values directly.
        -> No support for expressions: Traditional switch statements do not support expressions as case labels.
    yield statement: The yield statement is used to return a value from a switch expression. It allows you to specify the value that should be returned for a particular case.
//No {} braces = No yield (Java implicitly returns the expression).
//With {} braces = Must use yield to return the value.
 
 switch with Enum:
        -> Switch expressions can be used with enums, allowing you to handle different enum values in a more concise and expressive way.
        -> This is particularly useful when working with enums that represent a fixed set of constants, as it allows you to easily handle each constant in a clear and organized manner.
        an enum(Enumeration) is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (NORTH, SOUTH, EAST, WEST) and the days of the week.

JAVA 15 - Text Blocks (Preview feature in JAVA 13 Standard feature in JAVA 15)
        -> Text blocks are a new feature in Java that allow you to create multi-line string literals in a more readable and convenient way. 
        -> They are enclosed in triple quotes (""") and can span multiple lines, preserving the formatting of the text.
        -> Text blocks can be used to create strings that contain line breaks, indentation, and other formatting without the need for escape sequences or concatenation.
        Meaning of """"""" in different context:
        -> 1. In a text block, triple quotes are used to delimit the start and end of the block. The content inside the triple quotes is treated as a string literal, and any line breaks or indentation are preserved.
        -> 2. In a regular string literal, triple quotes are not valid syntax. If you try to use triple quotes in a regular string literal, you will get a syntax error.
        In python, triple quotes are used to create multi-line string literals, similar to text blocks in Java. However, in Java, triple quotes are only valid in the context of text blocks and cannot be used in regular string literals.
        for making comments in python we use triple quotes but in java we use // for single line comment and /* */ for multi line comment.

JAVA 16 - Records (Preview feature in JAVA 14 Standard feature in JAVA 16)
        -> Records are a new feature in Java that allow you to create classes that are primarily used to hold data. 
        -> They provide a concise syntax for defining classes that have a fixed set of properties, and automatically generate methods such as equals(), hashCode(), and toString() based on those properties.
        -> Records are immutable by default, meaning that their properties cannot be changed after they are created. This makes them useful for creating simple data structures that can be easily passed around in your code.
        Records can not extend other classes, but they can implement interfaces.
        Records automatically generate a constructor that takes all of the record's properties as parameters, and they also generate accessor methods for each property.
        Record can be used as DTO(Data Transfer Object) to transfer data between different layers of an application. 
        helps to avoid boilerplate code and make the code more readable and maintainable.
    when to use record:
        -> When you need to create a simple data structure that holds a fixed set of properties.
        -> When you want to avoid boilerplate code and make your code more readable and maintainable.
        -> When you want to create immutable objects that cannot be changed after they are created.
        -> When you want to create a class that is primarily used for data transfer between different layers of an application.

JAVA 17 - Sealed Classes (Preview feature in JAVA 15 Standard feature in JAVA 17)
        -> Sealed classes are a new feature in Java that allow you to restrict which classes can extend or implement a particular class or interface. 
        -> They provide a way to control the inheritance hierarchy of your classes and ensure that only a specific set of classes can be used as subclasses.
        -> Sealed classes are defined using the "sealed" keyword, and they can specify which classes are allowed to extend or implement them using the "permits" keyword.
        -> This feature is useful for creating more secure and maintainable code, as it allows you to limit the ways in which your classes can be used and extended.