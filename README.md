# Software Desgin Patterns & Principles

## Object Oriented Design Principles
1. Identify the aspects of your application that vary and separate them from what stays the same.
    a. Take what varies and "encapsulate" it so it won't affect the rest of the code.
    b. Fewer unintended consequences from code changes and more flexibility in the systems!
    c. Simply, take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.
2. Program to an interface, not to an implementation.
    a. Flexibility. We declare a variable with type as supertype (interface/abstract class), so that it gives us flexibilty to assign an object of the any concerete implementations of the supertype.
    b. “Program to an interface” really means “Program to a supertype.”
3. Favor composition over inheritance.
    a. Better Flexibility.
    b. lets you change behavior at runtime.

