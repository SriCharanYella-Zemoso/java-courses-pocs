package section_4_Functions;

import java.util.function.Function;

public class ComposingFunction {
    public static void main(String[] args) {
        // Creating a Function that adds 1 to an Integer
        Function<Integer, Integer> addOne = x -> x + 1;

        // Creating a Function that multiplies an Integer by 2
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        // Creating a composed Function that first adds 1 and then multiplies by 2
        Function<Integer, Integer> addOneAndMultiplyByTwo = addOne.andThen(multiplyByTwo);

        // Applying the composed Function to the number 3
        int result = addOneAndMultiplyByTwo.apply(3);

        System.out.println("Result: " + result);
    }
}
