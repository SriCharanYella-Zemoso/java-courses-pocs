package section_8_FileIO;

import section_7_OOP.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_8_1_RectangleFile {

    /*
        Reading rectangles data (format: length breadth) from rectangle_data.txt
        and creating Rectangle objects and printing their data.
     */

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        fillArrayList(rectangles);
        printRectanglesData(rectangles);
    }

    private static void fillArrayList(ArrayList<Rectangle> rectangles) {
        // reading data from rectangle_data.txt file and creating and filling the arraylist rectangles with Rectangle objects

        try {
            Scanner inputFile = new Scanner(new File("./src/section_8_FileIO/input/rectangle_data.txt"));
            while (inputFile.hasNext()) {
                double length = inputFile.nextDouble();
                double width = inputFile.nextDouble();
                rectangles.add(new Rectangle(length, width));
            }
            System.out.println("Read data successfully");
            inputFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void printRectanglesData(ArrayList<Rectangle> rectangles) {
        // printing data onto the screen
        for(Rectangle r: rectangles) {
            System.out.println();
            System.out.println("Length: " + r.getLength());
            System.out.println("width: " + r.getWidth());
            System.out.println("Area: " + String.format("%.2f",r.area()));
            System.out.println("Perimeter: " + String.format("%.2f",r.perimeter()));
        }
    }

}
