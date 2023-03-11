package section_5_String_StringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_5_1_NamePermutation  {

    public static void main(String[] args) {

        /*
            Taking 5 Full names form user and storing first and last names into separate arraylists
            and printing permutation of those first names & last names
         */

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String fullname;
        for(int i = 0; i < 5; ++i) {
            System.out.print("Enter a Full Name : ");
            fullname = input.nextLine();
            int idx = fullname.lastIndexOf(' ');
            firstNames.add(fullname.substring(0, idx));
            lastNames.add(fullname.substring(idx + 1));
        }

        // prints all permutations of first names and last names
        for(String firstName: firstNames) {
            for(String lastName: lastNames) {
                System.out.println(firstName + " " + lastName);
            }
        }
    }

}
