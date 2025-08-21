package objects;

import java.util.Scanner;

public class Rectangle {

    //Class represents model objects. Contains set of attributes and behaviours.

    //Encapsulation: Key principal of OOP. It specifies that the fields of a class should be private
    //and the method of the class should be public, to other classes to use.

    private double length;
    private double width;

    //Static member of a class has only one copy in memory, regardless of how many objects of the class are created.
    //And all instances of the class can access this single copy.
    public static String COLOR = "BLUE";

    // Constructor: Initializes a field or fields in a project. Default constructor may have no values. It is always defined implicit.

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }

    //Overloading: multiple methods with the same signature but differ from parameter list

    public double calculatePerimeter(double length, double width) {
        return (2*length) + (2*width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Return an object
    public Rectangle getRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        scanner.close();
        return new Rectangle(length, width);
    }

    //Static member or method
    //Part of a class that is accessible thought the class and belongs to that class.
    //Static methods can be called directly on the class name without to create an object of that class.

    public static void staticMethod() {
        System.out.println("The color of the rectangle is " + Rectangle.COLOR);

    }


}
