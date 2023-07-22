# Software Desgin Patterns & Principles

## Object Oriented Design Principles
1. **Identify the aspects of your application that vary and separate them from what stays the same.**
    * Take what varies and "encapsulate" it so it won't affect the rest of the code.
    * Fewer unintended consequences from code changes and more flexibility in the systems!
    * Simply, take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.
2. **Program to an interface, not to an implementation.**
    * Flexibility. We declare a variable with type as supertype (interface/abstract class), so that it gives us flexibilty to assign an object of the any concerete implementations of the supertype.
    * “Program to an interface” really means “Program to a supertype.”
3. **Favor composition over inheritance.**
    * Better Flexibility.
    * lets you change behavior at runtime.
4. **Strive for loosely coupled designs between objects that interact**
    * Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
5. Classes should be open for extension, but closed for modification.
    * Our goal is to allow classes to be easily extended to incorporate new behavior without modifying existing code.
    * Designs that are resilient to change and flexible enough to take on new functionality to meet changing requirements.