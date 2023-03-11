package section_8_FileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutputFun {
    public static void main(String[] args) {

        /*
            writing a file - "output.txt"
        */

        ArrayList<String> names = new ArrayList<>();
        names.add("Charan");
        names.add("Lokesh");
        names.add("Joel");
        names.add("Nikhil");
        names.add("Zeus");
        names.add("Priya");

        try {
            PrintWriter outputFile = new PrintWriter("./src/section_8_FileIO/output.txt");
            outputFile.println("Hello There");
            for(String name: names) {
                outputFile.println(name);
            }
            System.out.println("Written to file successfully");
            outputFile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Couldn't write through the file");
        }
    }
}
