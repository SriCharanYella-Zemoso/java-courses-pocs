package section_4_Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ComposingPredicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Creating a Predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Creating a Predicate to check if a number is greater than 5
        Predicate<Integer> isGreaterThan5 = n -> n > 5;

        // Creating a composed Predicate that checks if a number is even and greater than 5
        Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);

        // Filtering the list using the composed predicate
        List<Integer> evenAndGreaterThan5Numbers = filter(numbers, isEvenAndGreaterThan5);

        System.out.println("Original list: " + numbers);
        System.out.println("Even and greater than 5 numbers: " + evenAndGreaterThan5Numbers);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }
}
