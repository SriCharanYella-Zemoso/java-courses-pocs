package section_8_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {

    public static void main(String[] args) {
        Scanner numbersFile;
        PrintWriter twiceNumbersFile;
        try {
            numbersFile = new Scanner(new File("./src/section_8_FIleIO/numbers.txt"));
            twiceNumbersFile = new PrintWriter("./src/section_8_FileIO/twice_numbers.txt");
            while(numbersFile.hasNext()) {
                int num = numbersFile.nextInt();
                twiceNumbersFile.println(num * 2);
            }
            System.out.println("Written to file successfully");
            numbersFile.close();
            twiceNumbersFile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
