import abstraction.Shape;
import abstraction.Triangle;
import data_structures.Data_structures;
import inheritance.Employee;
import interfaces.Book;
import interfaces.Product;
import objects.Rectangle;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import streams.Streams;
import strings.Strings;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!!!!");

        // -------- Instantiate Object Rectangle --------

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);

        double areaRoom1 = room1.calculateArea();
        System.out.println("The area of the rectangle is " + areaRoom1);

        Rectangle room2 = new Rectangle(50, 25);
        double areaRoom2 = room2.calculateArea();
        System.out.println("The area of the rectangle is " + areaRoom2);

        Rectangle kitchen = room2.getRoom();
        System.out.println("Rectangle object " + kitchen);

        //Static member is accessed by the class's name.
        System.out.println(Rectangle.COLOR);

        //Static method is also accessed by the class's name.
        Rectangle.staticMethod();


        // -------- Inheritance --------

        Employee employee = new Employee();
        employee.setEmployeeId("123");
        employee.setSalary(70000);
        employee.setPhone(456123789);

        employee.setName("Mario Rocks");
        employee.setAge(31);

        System.out.println("Print the employee object created " + employee);


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
        book.setName("How to boost health for longevity.");

        // -------- DATA STRUCTURES --------

        // ARRAYS
        //The length of an arrays is fixed once is defined and cannot be changed
        String[] players = {"Bob", "Luke", "Chad", "Dan", "Henry", "Joe"};

        Data_structures exercises = new Data_structures();

        boolean elementFound = exercises.loopArraysAnfFindElement(players);
        boolean elementsAreUnique = Data_structures.allElementsAreUnique(players);
        System.out.println("Is element found in the array: " + elementFound);
        System.out.println("All elements of the array are unique: " + elementsAreUnique);


        // -------- STREAMS OPERATIONS --------

        Streams streamsExamples = new Streams();

        streamsExamples.createStreamAndPerformOperations();

        streamsExamples.createNewMap();


        // -------- STRINGS OPERATIONS --------

        //Static methods can be called by the name of the class

        String text = "Java essentials!!! Enjoy!!!";

        Strings.countWords(text);
        Strings.reverseString(text);
        Strings.reverseStringWithStringBuilder(text);
        Strings.toLowerCase(text);
        Strings.hasSpecialChars(text);
        Strings.isLetterFound(text);





    }


}