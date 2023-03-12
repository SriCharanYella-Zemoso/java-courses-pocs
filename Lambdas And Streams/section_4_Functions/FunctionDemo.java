package section_4_Functions;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Creating a Function that converts a String to an Integer
        Function<String, Integer> stringToIntegerConverter = Integer::parseInt;

        // Converting a String to an Integer using the Function
        int number = stringToIntegerConverter.apply("42");

        System.out.println("Number: " + number);
    }
}
