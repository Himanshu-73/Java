functional programming is a programming style where we solve problems by using function to process data and process result; rather than mainly changing thw state of objects.
As we know java is OOP oriented language so functional programming runs through:
1. Lambda expression
2. Functional Interface
3. Method reference
4. Stream API

Functional Interface
-> Predict/Predicate : It takes Input and return a boolean    test();
->function : It will take an input and after processing will reproduce some output.    apply()
-> Consumer : takes single input and no result or return  accept()
-> Supply : will take no input but produce of output    get()


Primitive functional interface  int,double,student
Primitive does not work with generics        =>   square =(x)->(x*x);

interface calculate{
    public void calc(int n);
}
class abc{
    p s v m(s a){
        abc a1=(n)->(n*n)
        sout(n*n)
        a1.calc(40);
    }
}


int -> short, byte
long
double-> float

primitive family function()

int ->R (integer function)            |       toint function<T>
long ->R (integer function)           |       tolong function<T>
double ->R (integer function)         |       todouble function<T>

Int supplier (void->int)  (void-> double)   (void->long)


char and string uses transfomation process and not iteration process



Method Reference 
Compact,shorthand syntax 
x=f(x)
(x)->x*x;
f(x)->obj->method();
(int->Integer)

function() -> wrapper class->objects->main() methods() -> arguments

Method references are compact forms of lambda expressions that do nothing except call an existing method. They improve readability and reduce boilerplate when the lambda body is a single method call
c++ -> scope resolution but in java " :: " this is called method referencing which is different from c++
In c++ there is no method referencing  :: is the scope resolution operator, used to access:
Static members of a class
Namespaces
Global variables/functions in c++