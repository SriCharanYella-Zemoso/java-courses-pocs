package section_4_Functions;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Creating a Supplier that generates a random number between 1 and 10
        Supplier<Integer> randomNumberGenerator = () -> (int) (Math.random() * 10) + 1;

        // Generating a random number using the Supplier
        int randomNumber = randomNumberGenerator.get();

        System.out.println("Random number between 1 and 10: " + randomNumber);
    }
}
