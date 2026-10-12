JAVA 9 - 21 Major updates and features include:

Java 9 introduced the Java Platform Module System (JPMS), which allows developers to modularize their applications and manage dependencies more effectively. 
-->A module is group of packages and resources together with a module descriptor file .
-->A module is a package of packages that can be compiled and run independently.(Separate project for each module)
By default all packages are module private 

Major GOals of Java 9:
1. Strong encapsulation of internal APIs
2. Explicit Dependencies
3. Better Maintainability
4. Reliable Configuration
5. Better Organization of code
----------------------------------------
Module() -> defines module name and its dependencies
Requires() -> defines the dependencies of the module
exports() -> makes a packages accessible to other modules
opens() -> allows reflective access to a package for other modules (Reflective access is used by frameworks and libraries that need to inspect or modify the behavior of classes at runtime)
uses()-> declares the module consumes a service
provides() -> declares the implementation of a service that the module provides
----------------------------------------
info() -> Descriptor file
Modules -> jar files
Modules are split into four types:
1. Java
2. Javafx
3. Oracle 
4. JDK

Java modules  --> Description | Package | Module | JDK version

Java 9 Shell
To run java code snippet instantly we need to create class/file
-> Jshell is java shell known as REPL(Read Evaluate Print Loop)
