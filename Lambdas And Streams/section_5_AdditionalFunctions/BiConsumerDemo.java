package section_5_AdditionalFunctions;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        // Creating a BiConsumer that prints the sum of two integers
        BiConsumer<Integer, Integer> printSum = (x, y) -> System.out.println("Sum: " + (x + y));

        // Using the BiConsumer to print the sum of two integers
        printSum.accept(5, 7);
    }
}
