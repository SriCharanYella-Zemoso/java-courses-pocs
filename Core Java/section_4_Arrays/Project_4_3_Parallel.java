package section_4_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_4_3_Parallel {

    public static void main(String[] args) {

        /*
            Taking names and ages from user and storing them into different array with same indices
         */

        ArrayList<String> names = new ArrayList<>(); // array of names
        ArrayList<Integer> ages = new ArrayList<>(); // array of ages

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; ++i) {
            System.out.print("Enter a name: ");
            names.add(input.next());
            System.out.print("Enter an age: ");
            ages.add(input.nextInt());

        }

        final String stringLiterel = "%s is %d years old";
        for(int i = 0; i<names.size(); ++i) {
            System.out.println(stringLiterel.formatted(names.get(i), ages.get(i)));
        }
    }
}
