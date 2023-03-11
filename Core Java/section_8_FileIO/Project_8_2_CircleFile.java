package section_8_FileIO;

import section_7_OOP.Circle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_8_2_CircleFile {

    /*
        Reading Circle data (format: radius) from rectangle_data.txt
        and creating Circle objects and printing their data into circle_output.txt file and onto the screen also.
     */

    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        fillArrayList(circles);
        String data = printCirclesData(circles);
        writeIntoFile(data);
    }

    private static void writeIntoFile(String data) {
        // writing data into circle_output.txt file
        try {
            PrintWriter outputFile = new PrintWriter("./src/section_8_FileIO/output/circle_output.txt");
            outputFile.print(data);
            outputFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void fillArrayList(ArrayList<Circle> circles) {
        // reading data from circle_data.txt file and creating and filling the arraylist rectangle with Circle objects
        try {
            Scanner inputFile = new Scanner(new File("./src/section_8_FileIO/input/circle_data.txt"));
            while(inputFile.hasNext()) {
                double radius = inputFile.nextDouble();
                circles.add(new Circle(radius));
            }
            System.out.println("Read data successfully");
            inputFile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String printCirclesData(ArrayList<Circle> circles) {
        // prints circles data and returns the same
        StringBuilder result = new StringBuilder();
        for(Circle r: circles) {
            result.append("\n\n");
            result.append("Radius: " + r.getRadius());
            result.append("\nArea: " + String.format("%.2f",r.area()));
            result.append("\nCircumference: " + String.format("%.2f",r.circumference()));
        }
        System.out.println(result);
        return result.toString();
    }

}