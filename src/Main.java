import abstraction.Shape;
import abstraction.Triangle;
import inheritance.Employee;
import interfaces.Book;
import interfaces.Product;
import objects.Rectangle;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!!!!");

        // -------- Instantiate Object Rectangle --------

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);

        double areaRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(50, 25);
        double areaRoom2 = room2.calculateArea();

        Rectangle kitchen = room2.getRoom();

        //Static member is accessed by the class's name.
        System.out.println(Rectangle.COLOR);

        //Static method is also accessed by the class's name.
        Rectangle.staticMethod();


        // -------- Inheritance --------

        Employee employee = new Employee();
        employee.getName();

        employee.setPhone(123456);


        // -------- Polymorphism --------

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();

        //Sasha can be a Dog or a Cat since both classes inherits from the Animal class
        sasha = new Cat();
        sasha.makeSound();

        //Instance of
        sasha.feed(sasha);


        // -------- Abstraction --------

        Shape triangle = new Triangle(5, 7);
        System.out.println(triangle.calculateArea());


        // -------- Interfaces --------

        Product book = new Book();
        book.setName("In the kitchen with H+ Sport");


    }


}