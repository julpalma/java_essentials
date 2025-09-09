import abstraction.Shape;
import abstraction.Square;
import abstraction.Triangle;
import data_structures.DataStructures;
import inheritance.Employee;
import interfaces.Book;
import interfaces.Product;
import objects.Rectangle;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import streams.Streams;
import strings.Strings;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!!!!");

        // -------- Instantiate Object Rectangle --------

        System.out.println("--------------------------------");
        System.out.println("Instantiate Object Rectangle!!!!");
        System.out.println("--------------------------------");

        Rectangle room1 = new Rectangle(50, 25);

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

        System.out.println("---------------------------");
        System.out.println("Inheritance!!!!");
        System.out.println("---------------------------");

        Employee employee = new Employee();
        employee.setEmployeeId("123");
        employee.setSalary(70000);
        employee.setPhone(456123789);

        employee.setName("Mario Rocks");
        employee.setAge(31);

        System.out.println("Print the employee object created " + employee);


        // -------- Polymorphism --------

        System.out.println("---------------------------");
        System.out.println("Polymorphism!!!!");
        System.out.println("---------------------------");

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

        System.out.println("---------------------------");
        System.out.println("Abstraction!!!!");
        System.out.println("---------------------------");

        Shape triangle = new Triangle(5, 7);
        System.out.println(triangle.calculateArea());
        triangle.print(triangle);

        Shape square = new Square(5, 7);
        System.out.println(square.calculateArea());
        square.print(square);


        // -------- Interfaces --------

        System.out.println("---------------------------");
        System.out.println("Interfaces!!!!");
        System.out.println("---------------------------");

        Product book = new Book();
        book.setName("How to boost health for longevity.");
        System.out.println("Name of the product created is " + book.getName());

        // -------- DATA STRUCTURES --------

        System.out.println("---------------------------");
        System.out.println("ARRAYS!!!!");
        System.out.println("---------------------------");

        // ARRAYS
        //The length of an arrays is fixed once is defined and cannot be changed
        String[] players = {"Bob", "Luke", "Chad", "Dan", "Henry", "Joe"};
        Integer[] numbers = {9, 22, 5, 6, 7, 45};

        boolean elementFound = DataStructures.loopArraysAnfFindElement(players);
        boolean elementsAreUnique = DataStructures.allElementsAreUnique(players);
        Optional<Integer> min = DataStructures.findMinElement(numbers);
        Optional<Integer> max = DataStructures.findMaxElement(numbers);
        System.out.println("Is element found in the array: " + elementFound);
        System.out.println("All elements of the array are unique: " + elementsAreUnique);
        min.ifPresent( num -> System.out.println("Min number in the array is: " + min.get()));
        max.ifPresent( num -> System.out.println("Max number in the array is: " + max.get()));

        // SET

        System.out.println("---------------------------");
        System.out.println("SET!!!!");
        System.out.println("---------------------------");
        DataStructures.findElementInSetAndRemove("apple");

        // LIST

        System.out.println("---------------------------");
        System.out.println("LIST!!!!");
        System.out.println("---------------------------");

        DataStructures.findElementInListAndRemove("tomato");

        // QUEUE AND STACK

        System.out.println("---------------------------");
        System.out.println("QUEUE AND STACK!!!!");
        System.out.println("---------------------------");

        DataStructures.queueOperations("apple");
        DataStructures.stackOperations("apple");

        // MAP

        System.out.println("---------------------------");
        System.out.println("MAP!!!!");
        System.out.println("---------------------------");

        DataStructures.findElementInMapAndRemove("apple");

        // -------- STREAMS OPERATIONS --------

        System.out.println("---------------------------");
        System.out.println("STREAMS OPERATIONS!!!!");
        System.out.println("---------------------------");

        Streams.createStreamAndPerformOperations();
        Streams.findEvenAndOddNumbersInTheList();
        List<Integer> nums =  Streams.findAllElemensStartingWith5();
        System.out.println("Numbers starting with 5 are: " + nums);
        Streams.findMaxAndMinElements();
        List<Integer> sorted = Streams.sortElements();
        System.out.println("Numbers sorted in ascending order: " + sorted);
        List<Integer> sortedDesc = Streams.sortElementsInDescendingOrder();
        System.out.println("Numbers sorted in descending order: " + sortedDesc);
        Streams.duplicatesInArray();
        List<Integer> s = Streams.performSquareOfValuesFromList();
        System.out.println("Square of values: " + s);
        Streams.createNewMap();


        // -------- STRINGS OPERATIONS --------

        System.out.println("---------------------------");
        System.out.println("STRINGS OPERATIONS!!!!");
        System.out.println("---------------------------");

        //Static methods can be called by the name of the class

        String text = "Java essentials!!! Enjoy!!!";

        Strings.countWords(text);
        Strings.reverseString(text);
        Strings.reverseStringWithStringBuilder(text);
        Strings.toLowerCase(text);
        Strings.hasSpecialChars(text);
        Strings.isLetterFound(text);


        // -------- READING FILE --------

        System.out.println("---------------------------");
        System.out.println("READING FILE!!!!");
        System.out.println("---------------------------");

        String path = "src/File";
        ReadFile.readFileFromPath(path);



    }


}