package section_6_Methods;

import java.util.ArrayList;

public class Project_6_1_SumOfElements {
    public static void main(String[] args) {
        /*
            Performing of sum of integers in a ArrayList
         */
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(15);

        System.out.println("Sum is : " + sumElements(numbers));

    }

    public static int sumElements(ArrayList<Integer> list) {
        // returns sum of all integers in th list
        int sum = 0;
        for(int i: list) {
            sum += i;
        }
        return sum;
    }
}
