package abstraction;

//This class cannot be instantiated
//Abstract classes are implemented by their subclasses
//Abstract method has no implementation. It is designed to be overridden by its subclass.
//If a subclass inherits from an abstract class, it must implement its abstracts methods OR the class itself must be declared as abstract.

public abstract class Shape {

    public abstract double calculateArea();

    public void print() {
        System.out.println("I am a shape");
    }

}
