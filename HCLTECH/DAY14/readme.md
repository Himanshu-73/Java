In Java 8, Optional<T> is a container class in java.util designed to represent a value that may or may not be present, helping avoid NullPointerException by providing safe access methods such as of(), ofNullable(), isPresent(), ifPresent(), orElse(), and orElseThrow().    
Java optional (Null problem)

String name =get nam();
Int len=name.length();

if null comes in name -NullpointerException

sol-> if (name!= null then procees)

[null check hell]
Problem with null

String Name = getname()
name=null?
-> empty name =No name enter
-> error API class= #rd party name
-> expected =against 

wrapper class -> optional class

optional<T> -> Optional<String>

optional<String> name=getname();
(It carries a function like name if present)
if present(System.out::println);

optional<String>name = optional.empty();
name if present() (Conusmer type) because no error if null comes as there is no output

class optional<T>{
    private final T value;
    
}