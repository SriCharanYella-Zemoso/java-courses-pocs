package section_8_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {

        /*
            Reading files - names.txt, ages.txt
            Writing into a single file - names_ages.txt
         */

        Scanner namesFile;
        Scanner agesFile;
        PrintWriter outputFile;
        try {

            namesFile = new Scanner(new File("./src/section_8_FileIO/names.txt"));
            agesFile = new Scanner(new File("./src/section_8_FileIO/ages.txt"));
            outputFile = new PrintWriter("./src/section_8_FileIO/names_ages.txt");

            String tempName;
            int tempAge;
            while(namesFile.hasNext() && agesFile.hasNext()) {
                tempAge = agesFile.nextInt();
                tempName = namesFile.nextLine();
                outputFile.println(tempName + " is " + tempAge + " years old");
            }

            System.out.println("Written to file successfully");

            // closing all files
            namesFile.close();
            agesFile.close();
            outputFile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
