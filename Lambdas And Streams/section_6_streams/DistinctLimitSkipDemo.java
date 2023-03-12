package section_6_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctLimitSkipDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .distinct()
                .skip(3)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}

