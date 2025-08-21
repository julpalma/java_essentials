package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    // --------------------- STREAMS ------------------------------------
    // Streams API Allows you to perform operations on the data without modifying the original source
    // Intermediate operations perform the operation and return the resulting stream
    // Terminal operations perform the operation and return a result and close the stream.

    List<Integer> nums = Arrays.asList(10, 12, 14, 5, 16, 18, 20, 22, 52, 10, 12, 14);
    List<String> numbers = Arrays.asList("10", "12", "14", "5", "16");

    public void createStreamAndPerformOperations() {

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
        foundFirstInThelist.ifPresent(v -> System.out.println("Found first element in the list." + foundFirstInThelist));

        Set<String> temp = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        vegetables.stream().filter(veg -> !temp.add(veg)).forEach(duplicates::add);
        System.out.println("Duplicates are: " + duplicates);

    }

    public void setOfVegetables(List<String> vegetables) {
        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("broccoli");
        vegetables.add("tomato");

        System.out.println("Number of elements in set of vegetables is " + vegetables.size());
    }


    public static void findEvenAndOddNumbersInTheList(List<Integer> nums) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        nums.stream().filter(num -> num % 2 == 0).forEach(evenNumbers::add);
        System.out.println("Even numbers: " + evenNumbers);

        nums.stream().filter(num -> num % 2 != 0).forEach(oddNumbers::add);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static List<Integer> findAllElemensStartingWith5(List<Integer> nums) {
        List<Integer> numsStartWith5 = new ArrayList<>();
        nums.stream().filter(num -> num.toString().startsWith("5")).forEach(numsStartWith5::add);
        return numsStartWith5;
    }

    public static void findMaxAndMinElements(List<Integer> nums) {
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        max.ifPresent(integer -> System.out.println("Max: " + integer));
        min.ifPresent(integer -> System.out.println("Min: " + integer));
    }

    public static List<Integer> sortElements(List<Integer> nums) {
        //Ascending order
        return nums.stream().sorted().toList();
    }

    public static List<Integer> sortElementsInDescendingOrder(List<Integer> nums) {
        return nums.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static void duplicatesInArray(int[] arr1) {
        if (Arrays.stream(arr1).distinct().count() != arr1.length) {
            System.out.println("Array contains duplicate elements");
        } else {
            System.out.println("Array contains unique elements");
        }
    }

    public static List<Integer> performSquareOfValuesFromList(List<Integer> nums) {
        return nums.stream().map(num -> num*num).collect(Collectors.toList());
    }

    public static List<Integer> convertListOfStringsInInteger (List<String> listOfStrings) {
        //To return a list of Integers
        return listOfStrings.stream().map(Integer::valueOf).toList();

    }

    public void createNewMap() {

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

    }

}
