package section_4_Arrays;

import java.util.ArrayList;

public class WrapperFun {

    public static void main(String[] args) {
        /*
            Working with Wrapper classes
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        for(int i = 0; i< numbers.size(); ++i) {
            System.out.println(numbers.get(i));
        }

        String someValue = "453";
        int numericValue = Integer.parseInt(someValue); // String of number to integer
        numericValue += 10;
        System.out.println(numericValue);

        String doubleValue = "34.73476";
        double result = Double.parseDouble(doubleValue); // String of number to double
        System.out.println(result);
    }

}
