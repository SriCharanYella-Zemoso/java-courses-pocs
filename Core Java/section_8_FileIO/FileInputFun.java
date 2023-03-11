package section_8_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {

        /*
            Reading a file - "input.txt"
         */

        Scanner inputFile;

        try {
            inputFile = new Scanner(new File("./src/section_8_FileIO/input.txt"));
            int input;
            int sum = 0;
            while(inputFile.hasNext()) {
                input = inputFile.nextInt();
                System.out.println(input);
                sum += input;
            }
            // printing the sum
            System.out.println("sum : " + sum);
            inputFile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Can't find file");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex) {
            System.out.println("Error reading file");
            System.out.println(ex.getMessage());
        }
    }
}
