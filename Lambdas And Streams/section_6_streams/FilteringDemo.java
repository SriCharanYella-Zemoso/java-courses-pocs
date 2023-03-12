package section_6_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "durian", "elderberry");

        String searchString = "er";

        String filteredString = strings.stream()
                .filter(s -> !s.contains(searchString))
                .collect(Collectors.joining(", "));

        System.out.println("Filtered string: " + filteredString);
    }
}

