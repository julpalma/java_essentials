package data_structures;

import java.util.*;

public class DataStructures {

    //------------------- ARRAYS ----------------------------
    // Class methods: toString(), asList(), sort(), binarySearch()

    public static boolean loopArraysAnfFindElement(String[] players) {
        boolean elementFound = false;
        for (String player : players) {
            if (player.equals("Joe")) {
                elementFound = true;
                break;
            }
        }
        return elementFound;
    }

    public static boolean allElementsAreUnique(String[] arr) {
        //Use of HashSet - only accepts unique elements
        HashSet<String> numbers = new HashSet<>();
        //Iterate over the arrays
        for (String element : arr) {
            if (!numbers.add(element)) {
                return false;
            }
        }
        //All elements are unique
        return true;

    }

    public static Optional<Integer> findMinElement(Integer[] elem) {
        return Arrays.stream(elem).min(Integer::compareTo);
    }

    public static Optional<Integer> findMaxElement(Integer[] elem) {
        return Arrays.stream(elem).max(Integer::compareTo);
    }

    //------------------- SET ----------------------------
    // Set is an interface. Unordered set of UNIQUE elements

    public static Set<String> createSet() {
        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println("Elements in set of fruits are " + fruits);
        System.out.println("Number of elements in set of fruits is " + fruits.size());

        iterateOverSet(fruits);

        return fruits;
    }

    // Find element in a set
    public static void findElementInSetAndRemove(String fruit) {
        Set<String> fruits = createSet();
        if(fruits.contains(fruit)) {
            System.out.println("Found fruit = " + fruit);
            fruits.remove(fruit);
            System.out.println("Fruit removed. Elements in the set now are " + fruits);
        }
    }

    // Immutable set of elements
    Set<String> immutableSet = Set.of("Apple, Banana", "orange");


    //--------------- LIST ----------------------
    // List is an interface - most of the widely used collections. It allows duplicates.
    // LinkedList, ArrayList, Stack (LIFO), and Vector
    // Rich collection methods (adding, removing, sorting, searching, contains, streams)

    public static List<String> createList() {
        List<String> vegetables = new ArrayList<>();

        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("broccoli");
        vegetables.add("tomato");

        enhancedForLoop(vegetables);

        System.out.println("Number of elements in the list of vegetables is " + vegetables.size());

        return vegetables;
    }

    // Find element in a list
    public static void findElementInListAndRemove(String veg) {
        List<String> vegetables = createList();

        if(vegetables.contains(veg)) {
            System.out.println("Found vegetable.");
            vegetables.remove(veg);
            System.out.println("Vegetable removed. The elements in the list now are " + vegetables);
        }
    }

    // Immutable list of elements
    List<String> immutableList = List.of("tomato", "carrot", "broccoli", "carrot");


    // ----------------- QUEUE / STACK -------------------------
    // QUEUE -> It holds a list of elements to be processed
    // LinkedList - Ordered collection, and it allows duplicates
    // FIFO

    // STACK -> LIFO
    public static Queue<String> addToTheQueue() {
        Queue<String> queueOfFruits = new LinkedList<>();

        queueOfFruits.add("apple");
        queueOfFruits.add("lemon");
        queueOfFruits.add("banana");
        queueOfFruits.add("orange");

        System.out.println("Elements in the queue are " + queueOfFruits);
        System.out.println("Number of elements in the queue is " + queueOfFruits.size());

        return queueOfFruits;
    }

    public static Stack<String> addToTheStack() {
        Stack<String> stackOfFruits = new Stack<>();

        stackOfFruits.add("apple");
        stackOfFruits.add("lemon");
        stackOfFruits.add("banana");
        stackOfFruits.add("orange");

        System.out.println("Elements in the stack are " + stackOfFruits);
        System.out.println("Number of elements in the stack is " + stackOfFruits.size());

        return stackOfFruits;
    }

    public static void queueOperations(String fruit) {
        Queue<String> queueOfFruits = addToTheQueue();

        //It removes the first element of the queue. Apple
        var fruitRemoved = queueOfFruits.remove();
        System.out.println("Removed element. Elements in the queue now are " + queueOfFruits);

        //It returns the head of the queue and does not remove it
        var headOfQueue = queueOfFruits.peek();
        System.out.println("Element in the head of the queue is " + headOfQueue);
    }

    public static void stackOperations(String fruit) {
        Stack<String> stackOfFruits = addToTheStack();

        //It removes the element at the top of the stack.
        var fruitRemoved = stackOfFruits.pop();
        System.out.println("Removed element. Elements in the stack now are" + stackOfFruits);

        //It returns the head of the queue and does not remove it
        var headOfQueue = stackOfFruits.peek();
        System.out.println("Element in the head of the stack is " + headOfQueue);
    }


    // ----------------- MAP -----------------------
    // It is considered a collection
    // Key value pair
    // Do not allow duplicate keys

    public static Map<String, Integer> createMap() {
        Map<String, Integer> fruitCalories = new HashMap<>();

        fruitCalories.put("apple", 20);
        fruitCalories.put("lemon", 15);
        fruitCalories.put("banana", 50);
        fruitCalories.putIfAbsent("orange", 30);

        System.out.println("Elements in the MAP are " + fruitCalories);
        System.out.println("Number of elements in the MAP is " + fruitCalories.size());

        return fruitCalories;
    }

    public static void findElementInMapAndRemove(String key) {
        Map<String, Integer> fruitCalories = createMap();

        if (fruitCalories.containsKey(key)) {
            System.out.println("Found fruit.");
            fruitCalories.remove(key);
            System.out.println("Element removed from map. Map elements now are = " + fruitCalories);
        }

        printMap(fruitCalories);
        findValueInMapCompareAndUpdate(fruitCalories);
        mapAndLambdas(fruitCalories);
    }

    // Loop map to perform operations
    public static void loopMap(Map<String, Integer> fruitCalories) {
        for(Map.Entry<String, Integer> entry : fruitCalories.entrySet()) {
            if(entry.getKey().equals("apple")) {
                System.out.println("Found fruit");
            }
        }
    }

    // Print map
    public static void printMap(Map<String, Integer> fruitCalories) {
        Set<Map.Entry<String, Integer>> mapEntries = fruitCalories.entrySet();
        System.out.println("Print set of a map entries " + mapEntries);

        Set<String> mapKeys = fruitCalories.keySet();
        System.out.println("Print set of a keys from a map " + mapEntries);

        Collection<Integer> mapValues = fruitCalories.values();
        System.out.println("Print set of a values from a map " + mapEntries);
    }

    // Map operations
    public static void findValueInMapCompareAndUpdate(Map<String, Integer> fruitCalories) {
        fruitCalories.forEach((k, v) -> {
            //Get the value of the key
            Integer cal = fruitCalories.get(k);
            System.out.println(fruitCalories.get(k));

            if (k.equals("lemon") && cal <= 15) {
                //Update value of a key in a map
                fruitCalories.put(k, 30);
                System.out.println("Updated value for lemon to " + fruitCalories.get("lemon"));
            }
        });
    }

    // Immutable Map
    Map<String, Integer> immutableMap = Map.of("apple", 20, "banana", 50);


    // ----------------- ITERATOR --------------------------------
    // Also an interface within the Java Collections Framework.
    // It allows to loop thought the elements of collections.

    // Mutable set of strings
    public static void iterateOverSet(Set<String> fruits) {
        var i = fruits.iterator();

        while(i.hasNext()) {
            //Print the next element
            System.out.println("Print the next element in the set " + i.next());
        }
    }

    // --------------- ENHANCED FOR LOOP --------------------------

    public static void enhancedForLoop(List<String> vegetables) {
        for(String veg : vegetables) {
            System.out.println("Print elements from the list." + veg);
        }
    }

    // -------------- FOREACH AND LAMBDAS --------------------
    // Lambdas are short block of code that accepts parameters and returns a value
    // They don't have names and are executed in one line.

    public void forEachAndLambdas(List<String> vegetables) {
        vegetables.forEach(f -> System.out.println("Print vegetable " + f));

        //Method reference - class name :: method name
        vegetables.forEach(System.out::println);
    }

    public static void mapAndLambdas(Map<String, Integer> fruitCalories) {
        //Print key and value from a map
        System.out.println("Print map using lambdas");
        fruitCalories.forEach((k, v) -> System.out.println(k + ":" + v));
    }

}
