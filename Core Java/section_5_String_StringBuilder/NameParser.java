package section_5_String_StringBuilder;

import java.util.Scanner;

public class NameParser {

    public static void main(String[] args) {
        /*
            Taking  Full name from user and printing first name in Uppercase and last name in lowercase
         */
        Scanner input = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;

        System.out.println("What is your full name?");
        fullName = input.nextLine();
        int indexOfSpace = fullName.lastIndexOf(' ');
        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace);

        firstName = firstName.toUpperCase(); // First name in uppercase
        lastName = lastName.toLowerCase(); // Last name in lowercase

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);

    }

}
