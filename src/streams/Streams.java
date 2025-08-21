package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    // --------------------- STREAMS ------------------------------------
    // Streams API Allows you to perform operations on the data without modifying the original source
    // Intermediate operations perform the operation and return the resulting stream
    // Terminal operations perform the operation and return a result and close the stream.

    int[] numbers = {0, 2, 4, 6, 8 ,10};

    public void createStreamAndPerformOperations() {

        List<String> vegetables = new ArrayList<>();
        // populate the list
        setOfVegetables(vegetables);

        // anyMatch is a terminal operation. No more operations can be performed
        vegetables.stream().anyMatch(v -> v.contains("carrot"));

        // allMatch is a terminal operation. It checks if all elements contains letter c. Returns false if one element doesn't contain c
        vegetables.stream().allMatch(v -> v.contains("c"));

        // filter is an intermediate operation. foreach is a terminal operation
        vegetables.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);

        // filter is an intermediate operation. Return a new List.
        vegetables.stream().filter(v -> v.startsWith("c")).collect(Collectors.toList());

        // map is an intermediate operation.
        vegetables.stream().map(String::toUpperCase).forEach(System.out::println);

        // print all elements in alphabetical order
        vegetables.stream().sorted().forEach(System.out::println);

        // 0 is the initial value to start from. Result is 30, sum of all elements
        Arrays.stream(numbers).reduce(0, Integer::sum);
    }

    public void setOfVegetables(List<String> vegetables) {
        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("broccoli");
        vegetables.add("tomato");

        System.out.println("Number of elements in set of vegetables is" + vegetables.size());
    }
}
