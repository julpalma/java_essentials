package data_structures;

import java.util.*;

public class Data_structures {

    //------------------- ARRAYS ----------------------------

    public boolean loopArraysAnfFindElement(String[] players) {
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
            };
        }
        //All elements are unique
        return true;

    }

    //------------------- SET ----------------------------
    // Set is an interface. Unordered set of UNIQUE elements

    // Mutable set of strings
    Set<String> fruits = new HashSet<>();

    public void setOfFruits(Set<String> fruits) {
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println("Number of elements in set of fruits is" + fruits.size());
    }

    // Find element in a set
    public void findFruit(String banana) {
        if(fruits.contains(banana)) {
            System.out.println("Found fruit");
        }
    }

    // Remove element from a set
    public void removeFruit(String banana) {
        if(fruits.contains(banana)) {
            fruits.remove(banana);
            System.out.println("Fruit removed");
        }
    }

    // Immutable set of elements
    Set<String> immutableSet = Set.of("Apple, Banana", "orange");


    //--------------- LIST ----------------------
    // List is an interface - most of the widely used collections. It allows duplicates.
    // LinkedList, ArrayList, Stack, and Vector

    List<String> vegetables = new ArrayList<>();

    public void setOfVegetables(List<String> vegetables) {
        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("broccoli");
        vegetables.add("tomato");

        System.out.println("Number of elements in set of vegetables is" + vegetables.size());
    }

    // Find element in a set
    public void findVegetable(String carrot) {
        if(vegetables.contains(carrot)) {
            System.out.println("Found vegetable");
        }
    }

    // Remove element from a list. Note that the first element found is removed.
    public void removeVegetable(String carrot) {
        if(vegetables.contains(carrot)) {
            fruits.remove(carrot);
            System.out.println("Vegetable removed");
        }
    }

    // Immutable list of elements
    List<String> immutableList = List.of("tomato", "carrot", "broccoli", "carrot");


    // ----------------- QUEUE -------------------------
    // It holds a list of elements to be processed
    // LinkedList - Ordered collection, and it allows duplicates
    // FIFO

    Queue<String> queueOfFruits = new LinkedList<>();

    public void addToTheQueue(Queue<String> queueOfFruits) {
        queueOfFruits.add("apple");
        queueOfFruits.add("lemon");
        queueOfFruits.add("banana");
        queueOfFruits.add("apple");

        System.out.println("Number of elements in the queue is" + queueOfFruits.size());
    }

    public void removeFruitFromQueue(String fruit) {
        //It removes the first element of the queue. Apple
        var fruitRemoved = queueOfFruits.remove();
        //It returns the head of the queue and does not remove it
        var headOfQueue = queueOfFruits.peek();
    }

    // ----------------- MAP -----------------------
    // It is considered a collection
    // Key value pair
    // Do not allow duplicate keys

    Map<String, Integer> fruitCalories = new HashMap<>();

    public void createMap(Map<String, Integer> fruitCalories) {
        fruitCalories.put("apple", 20);
        fruitCalories.put("lemon", 15);
        fruitCalories.put("banana", 50);
        fruitCalories.putIfAbsent("apple", 30);

        System.out.println("Number of elements in the MAP is" + fruitCalories.size());
    }

    // Find element in a queue
    public void findElementQueue(String apple, Integer value) {
        if(fruitCalories.containsKey(apple)) {
            System.out.println("Found fruit");
        }
        System.out.println("The value of the key = " + apple + " is " + fruitCalories.get(apple));

        if(fruitCalories.containsValue(value)) {
            System.out.println("Found fruit");
        }
    }

    // Loop map
    public void loopMap(Map<String, Integer> fruitCalories) {
        for(Map.Entry<String, Integer> entry : fruitCalories.entrySet()) {
            if(entry.getKey().equals("apple")) {
                System.out.println("Found fruit");
            }
        }
    }

    // Print map
    public void printMap(Map<String, Integer> fruitCalories) {
        Set<Map.Entry<String, Integer>> mapEntries = fruitCalories.entrySet();
        System.out.println("Print set of a map" + mapEntries);

        Set<String> mapKeys = fruitCalories.keySet();
        System.out.println("Print set of a keys from a map" + mapEntries);

        Collection<Integer> mapValues = fruitCalories.values();
        System.out.println("Print set of a values from a map" + mapEntries);
    }

    public void findValueInMapCompareAndUpdate() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        createMap(fruitCalories);

        fruitCalories.forEach((k, v) -> {
            //Get the value of the key
            Integer cal = fruitCalories.get(k);
            System.out.println(fruitCalories.get(k));

            if (k.equals("apple") && cal <= 20) {
                //Update value of a key in a map
                fruitCalories.put(k, 30);
            }
        });
    }

    // Immutable Map
    Map<String, Integer> immutableMap = Map.of("apple", 20, "banana", 50);


    // ----------------- ITERATOR --------------------------------
    // Also an interface within the Java Collections Framework.
    // It allows to loop thought the elements of collections.

    // Mutable set of strings
    Set<String> setOfFruits = new HashSet<>();

    public void iterateOverSet() {
        setOfFruits(setOfFruits);

        var i = setOfFruits.iterator();

        while(i.hasNext()) {
            //Print the next element
            System.out.println("Print the next element" + i.next());
        }
    }

    // --------------- ENHANCED FOR LOOP --------------------------

    public void enhancedForLoop() {

        List<String> vegetables = new ArrayList<>();
        //Populate the list
        setOfVegetables(vegetables);

        for(String veg : vegetables) {
            if(veg.equals("carrot")) {
                System.out.println("Vegetable found");
            }
        }
    }

    // -------------- FOREACH AND LAMBDAS --------------------
    // Lambdas are short block of code that accepts parameters and returns a value
    // They don't have names and are executed in one line.

    public void forEachAndLambdas() {
        vegetables.forEach(f -> System.out.println("Print vegetable " + f));

        //Method reference - class name :: method name
        vegetables.forEach(System.out::println);

        //Apply multiple statements
        vegetables.forEach( f -> {
            f = "fruits + f";
            System.out.println("f");
        });
    }

    public void mapAndLambdas() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        createMap(fruitCalories);

        //Print key and value from a map
        fruitCalories.forEach((k, v) -> System.out.println(k + ":" + v));
    }



}
