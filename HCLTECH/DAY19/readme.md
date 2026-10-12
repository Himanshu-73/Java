Immutable collections:
An immutable collection is a collection that cannot be modified after it is created. Java introduced convenient factory methods such as List.of(), Set.of(), and Map.of() to create immutable collections in Java 9.
Why we use immutable collections:
1.Prevents Accidental modification of data.
2.Make configuration and constant data safer and easier to manage.
3.Improves code readability and maintainability
4.Helps create Predictable APIs and reduces bugs in multi-threaded environments.
obj-> var  (cross)
    -> method  (cross)
-> Mark any class as final
-> mark any method as final

