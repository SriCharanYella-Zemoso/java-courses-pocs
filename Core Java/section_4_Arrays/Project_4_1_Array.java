package section_4_Arrays;

import java.util.Scanner;

public class Project_4_1_Array {

    public static void main(String[] args) {
        /*
            getting 5 integers from user and printing their doubles
         */
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i<numbers.length; ++i) {
            System.out.print("Enter an integer : ");
            numbers[i] = input.nextInt();
        }

        for(int i = 0; i<numbers.length; ++i) {
            int result = numbers[i] * 2;
            System.out.println(result);
        }

    }

}
