package section_5_AdditionalFunctions;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // Creating a BiPredicate that checks if two integers are equal
        BiPredicate<Integer, Integer> areEqual = (x, y) -> x.equals(y);

        // Testing the BiPredicate with two integers
        boolean result1 = areEqual.test(5, 5);
        boolean result2 = areEqual.test(5, 10);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
