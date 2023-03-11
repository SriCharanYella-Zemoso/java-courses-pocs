package section_2_Intro_to_Java;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        // Taking input from the user

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, " + name);
    }


}
