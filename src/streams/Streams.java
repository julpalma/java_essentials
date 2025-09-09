package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    // --------------------- STREAMS ------------------------------------
    // Streams API Allows you to perform operations on the data without modifying the original source
    // Intermediate operations perform the operation and return the resulting stream
    // Terminal operations perform the operation and return a result and close the stream.

    public static void createStreamAndPerformOperations() {

        List<String> vegetables = new ArrayList<>();
        // populate the list
        setOfVegetables(vegetables);

        // anyMatch is a terminal operation. No more operations can be performed
        boolean matches = vegetables.stream().anyMatch(v -> v.contains("carrot"));
        System.out.println("Found vegetable in the list: " + matches);

        // allMatch is a terminal operation. It checks if all elements contains letter c. Returns false if one element doesn't contain c
        matches = vegetables.stream().allMatch(v -> v.contains("c"));
        System.out.println("All vegetables have specified condition: " + matches);

        // filter is an intermediate operation. foreach is a terminal operation
        vegetables.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);

        // filter is an intermediate operation. Return a new List.
        List<String> newList = vegetables.stream().filter(v -> v.startsWith("c")).toList();
        System.out.println("New list is " + newList);

        // map is an intermediate operation.
        vegetables.stream().map(String::toUpperCase).forEach(System.out::println);

        // print all elements in alphabetical order
        vegetables.stream().sorted().forEach(System.out::println);

        Optional<String> foundFirstInThelist = vegetables.stream().findFirst();
        foundFirstInThelist.ifPresent(v -> System.out.println("Found first element in the list." + foundFirstInThelist.get()));

        Set<String> temp = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        vegetables.stream().filter(veg -> !temp.add(veg)).forEach(duplicates::add);
        System.out.println("Duplicates are: " + duplicates);

    }

    public static void setOfVegetables(List<String> vegetables) {
        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("broccoli");
        vegetables.add("tomato");

        System.out.println("Number of elements in set of vegetables is " + vegetables.size());
    }

    public static List<Integer> createListOfNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(55);
        numbers.add(2);
        numbers.add(85);
        numbers.add(7);
        numbers.add(1);
        numbers.add(10);
        numbers.add(35);

        return numbers;
    }


    public static void findEvenAndOddNumbersInTheList() {
        List<Integer> numbers = createListOfNumbers();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        numbers.stream().filter(num -> num % 2 == 0).forEach(evenNumbers::add);
        System.out.println("Even numbers: " + evenNumbers);

        numbers.stream().filter(num -> num % 2 != 0).forEach(oddNumbers::add);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static List<Integer> findAllElemensStartingWith5() {
        List<Integer> numbers = createListOfNumbers();

        List<Integer> numsStartWith5 = new ArrayList<>();
        numbers.stream().filter(num -> num.toString().startsWith("5")).forEach(numsStartWith5::add);
        return numsStartWith5;
    }

    public static void findMaxAndMinElements() {
        List<Integer> numbers = createListOfNumbers();

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        max.ifPresent(integer -> System.out.println("Max: " + integer));
        min.ifPresent(integer -> System.out.println("Min: " + integer));
    }

    public static List<Integer> sortElements() {
        List<Integer> numbers = createListOfNumbers();

        //Ascending order
        return numbers.stream().sorted().toList();
    }

    public static List<Integer> sortElementsInDescendingOrder() {
        List<Integer> numbers = createListOfNumbers();

        return numbers.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static void duplicatesInArray() {
        int[] arr1 = {1, 2, 3, 5, 8, 10, 1, 3, 1};
        if (Arrays.stream(arr1).distinct().count() != arr1.length) {
            System.out.println("Array contains duplicate elements");
        } else {
            System.out.println("Array contains unique elements");
        }
    }

    public static List<Integer> performSquareOfValuesFromList() {
        List<Integer> numbers = createListOfNumbers();
        return numbers.stream().map(num -> num*num).collect(Collectors.toList());
    }

    public static List<Integer> convertListOfStringsInInteger(List<String> listOfStrings) {
        //To return a list of Integers
        return listOfStrings.stream().map(Integer::valueOf).toList();

    }

    public static void createNewMap() {

        Map<Integer, Integer> schoolScores = new HashMap<>();
        schoolScores.put(1, 80);
        schoolScores.put(2, 50);
        schoolScores.put(3, 75);
        schoolScores.put(4, 75);
        schoolScores.put(5, 60);
        schoolScores.put(6, 85);
        schoolScores.put(7, 90);
        schoolScores.put(8, 90);

        Set<Map.Entry<Integer, Integer>> entries = schoolScores.entrySet();

        //Perform stream operation
        Map<Integer, Integer> listScoreHigherThan75 = entries.stream().
                filter( s -> s.getValue() >= 75)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("List of scores higher than 75 is: " + listScoreHigherThan75);

        //Perform a for loop
        Map<Integer, Integer> newlist = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() >= 75) {
                newlist.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("List of scores higher than 75 is: " + newlist);

        //Find how many students there is with score 90
        List<Map.Entry<Integer, Integer>> studentsWithScore90 = schoolScores.entrySet().stream()
                .filter(s -> s.getValue() == 90)
                .toList();

        System.out.println("The number of students with score 90 is " + studentsWithScore90.size());

    }

}
