package section_3_control_statements;

import java.util.Scanner;

public class DivisibileByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();

        // checking whether the userNumber is divisible by three

        if(userNumber % 3 == 0) {
            System.out.println(userNumber + " is divisible by 3");
        }
        else {
            System.out.println(userNumber + " is not divisible by 3");
        }
    }
}
