package section_4_Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Jane", "Bob", "Alice"));

        // Creating a Consumer to print a name in uppercase
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());

        // Creating a Consumer to print a name in lowercase
        Consumer<String> printLowerCase = name -> System.out.println(name.toLowerCase());

        // Creating a composed Consumer that prints a name in both uppercase and lowercase
        Consumer<String> printBoth = printUpperCase.andThen(printLowerCase);

        // Applying the composed Consumer to each name in the list
        names.forEach(printBoth);
    }
}
