package section_4_Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Creating a Predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Filtering the list using the isEven predicate
        List<Integer> evenNumbers = filter(numbers, isEven);

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
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
