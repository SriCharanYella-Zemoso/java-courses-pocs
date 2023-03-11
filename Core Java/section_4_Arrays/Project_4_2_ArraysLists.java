package section_4_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_4_2_ArraysLists {

    public static void main(String[] args) {
        /*
            Taking Doubles from input into an ArrayList until user enters a negative number
            and printing them in reverse order
         */
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        System.out.print("Enter 0 or more to put in the list or (<0) to exit : ");
        userInput = input.nextDouble();
        while(userInput >= 0) {
            numbers.add(userInput);
            System.out.print("Enter 0 or more to put in the list or (<0) to exit : ");
            userInput = input.nextDouble();
        }
        for(int i = numbers.size() - 1; i>=0; --i) {
            System.out.println(numbers.get(i));
        }
    }
}
