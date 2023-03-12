package section_6_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreatingStreams {

    private void testCollectionSystem() {

    }
    private void testEmptyStream() {
        Stream<Integer> emptyStream = Stream.empty();
        System.out.println("Empty Stream : " + emptyStream.count());
    }
    private void testStreamFromValues() {
        Stream<String> movieNames = Stream.of("Gods must be crazy", "Fiddler On the Roof");
        System.out.println(movieNames.count());
    }
    private void testFileStreams() {
        try {
            Stream<String> fileLines = Files.lines(Paths.get("/src/LamdbaStreamsPOCs.iml"));
            fileLines.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void testGenereteIterateStreams() {
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.forEach(System.out::println);
//        Stream<Integer> multiplesOfTen = Stream.iterate(10, i -> i + 10);
//        multiplesOfTen.forEach(System.out::println);
    }

    public static void main(String[] args) {
        CreatingStreams testStreams = new CreatingStreams();
        testStreams.testEmptyStream();
        testStreams.testStreamFromValues();
        testStreams.testGenereteIterateStreams();
        testStreams.testFileStreams();
    }

}
