package section_6_streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {10L, 20L, 30L, 40L, 50L};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        // IntStream example
        IntStream intStream = Arrays.stream(intArray);
        int sum = intStream.sum();
        System.out.println("The sum of the integer array is " + sum);

        // LongStream example
        LongStream longStream = Arrays.stream(longArray);
        long min = longStream.min().orElse(0L);
        System.out.println("The minimum value of the long array is " + min);

        // DoubleStream example
        DoubleStream doubleStream = Arrays.stream(doubleArray);
        double average = doubleStream.average().orElse(0.0);
        System.out.println("The average value of the double array is " + average);

    }
}

