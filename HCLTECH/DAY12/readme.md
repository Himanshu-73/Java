1) classes
2) iteratives
3) for each -> sort handling
4) functional prog oops(cross) methods(tick)
5) now -> streams in java
   java Streams uses lambda function for data processing
The Stream API in Java, introduced in Java 8, is a powerful tool for processing collections of objects in a functional and declarative manner. It allows operations like filtering, mapping, reducing, and sorting, enabling developers to write concise and readable code.

1)class Employee{                  2) In traditional method
    int emp id;                      List<obj> result=new ArrayList<>();
    String Name;
    Employee 
}

3)for(Emoloyee c: employee)
 if(emp.salary>50k){
    result.add();
    result.get()
 }

 So main motto of Streams is to convert the imperative code to declarative one/ The main Objective of Streams in java is not to tell "How to be done" but will ask "What operations to be done"

 employee.stream();
So stream is a method that comes form collection framework

collection flow
-> Stream()->Parallel Stream()

WHat is a stream?
A stream is a tool for processing a sequence of data through a chain of operations.

Streams()
Filter(x->x>10)
Filter(x->x%2==0)
Map(x->x*x)
For each(Lambda//Method ref.)
For each(System.out::Println)

source -> intermedita operation  -> terminal output


List.stream
-> collections
-> arrays
->stream.of()
-> infinite stream

terminal output->
soup(x)
toList()
Collect()
Findfirst()