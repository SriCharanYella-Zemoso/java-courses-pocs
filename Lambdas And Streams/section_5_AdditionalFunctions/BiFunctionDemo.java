package section_5_AdditionalFunctions;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        // Creating a BiFunction that adds two integers and returns their sum as a String
        BiFunction<Integer, Integer, String> addAndConvertToString = (x, y) -> "Sum: " + (x + y);

        // Using the BiFunction to add two integers and convert their sum to a String
        String result = addAndConvertToString.apply(5, 7);
        System.out.println(result);
    }
}

