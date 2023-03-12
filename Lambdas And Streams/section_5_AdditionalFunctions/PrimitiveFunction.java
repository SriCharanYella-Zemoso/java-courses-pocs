package section_5_AdditionalFunctions;

import java.util.function.IntFunction;

public class PrimitiveFunction {

    public static void main(String[] args) {
        // Creating an IntFunction that returns the square of an integer
        IntFunction<Integer> square = x -> x * x;

        // Using the IntFunction to calculate the square of an integer
        int result = square.apply(5);
        System.out.println(result);
    }
}
