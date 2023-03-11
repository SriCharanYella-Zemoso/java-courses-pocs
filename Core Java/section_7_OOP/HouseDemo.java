package section_7_OOP;

public class HouseDemo {

    public static void main(String[] args) {

        /*
            Creating House Objects and working with its methods
         */

        House House_1 = new House(2, 6, "red");
        House House_2 = new House(3, 10, "blue");

        // printing the details of the house
        printHouseData(House_1);
        printHouseData(House_2);
    }

    public static void printHouseData(House house) {
        System.out.println("The House is " + house.getColor() + "\nand has " + house.getNumStories() + " stories\nand " + house.getNumWindows() + " windows.\n\n");
    }
}
