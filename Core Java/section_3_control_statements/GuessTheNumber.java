package section_3_control_statements;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int userGuess;
        int computerNumber;
        int guessCount = 0; // user Guess count
        Random random = new Random();
        boolean userGuessedNumber = false;
        Scanner input = new Scanner(System.in);

        computerNumber = random.nextInt(100) + 1;
        while(!userGuessedNumber) { // loops until user guesses the number
            System.out.println("Enter your integer guess : ");
            userGuess = input.nextInt();
            guessCount++; // guess count increase
            if(userGuess >= 1 && userGuess <= 100) {

                if (userGuess == computerNumber) {
                    // guess is correct
                    System.out.println("Congratulations! You have guessed the number in " + guessCount);
                    userGuessedNumber = true;
                } else if (userGuess > computerNumber) {
                    // guess is too high
                    System.out.println("Your guess is too high");
                }
                else {
                    // guess is too low
                    System.out.println("Your guess is too low");
                }
            }
            else {
                System.out.println("That was a wasted guess, Number should be in range = [1, 100]");
            }
        }
    }
}
