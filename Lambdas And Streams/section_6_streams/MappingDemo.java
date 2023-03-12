package section_6_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squares: " + squares);
    }
}
