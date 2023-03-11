package section_3_control_statements;

import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {

        // Simulation of Dice

        Random random = new Random();
        int diceVal;
        for(int i = 0; i<10; ++i) {

            // getting random number from 1 to 6
            
            diceVal = random.nextInt(6) + 1;
            System.out.println(diceVal);
        }
    }
}
