package section_6_Methods;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToeGameController {
    public void runGame() {
        String winner = "";
        boolean xTurn = true;
        int theRow = 0;
        int theCol = 0;

        String[][] gameBoard = new String[3][3];

        initializeGameBoard(gameBoard);

        // print initial board
        printCurrentBoard(gameBoard);
        // "" signals no winner

        while(winner.equals("")) {
            if(xTurn) {
                System.out.println("It is X's turn");
            }
            else {
                System.out.println("It is O's turn");
            }

            getUserInput(xTurn, gameBoard);
            System.out.println(); //  extra spacing

            printCurrentBoard(gameBoard); // reprint board
            winner = getWinner(gameBoard);
            xTurn = !xTurn;

            if(winner.equals("") && isBoardFull(gameBoard)) {
                winner = "C";
            }
        }

        System.out.println();
        if(winner.equals("C")) {
            System.out.println("It was the Cat's game! NO WINNER");
        }
        else {
            System.out.println("The winner is " + winner);
        }
    }

    private void initializeGameBoard(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            Arrays.fill(strings, " ");
        }
    }

    private void printCurrentBoard(String[][] gameBoard) {
        for(int i = 0 ; i < gameBoard.length; ++i) {
            for(int j = 0; j < gameBoard[i].length; ++j) {
                System.out.print(gameBoard[i][j]);
                if(j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i < 2) {
                System.out.print("- - - - -");
            }

            // to add space between the board and next output

            System.out.println();
        }
    }

    private void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner input = new Scanner(System.in);

        int row = -1;
        int col = -1;
        boolean keepAsking = true;
        while(keepAsking) {
            System.out.println("Please enter thr row THEN the column, each from 0, 1 or 2, separated by a space");
            row = input.nextInt();
            col = input.nextInt();
            input.nextLine(); // consume line

            if(row >= 0 && row <= 2 && col >= 0 && col <= 2) {
                if(!cellAlreadyOccupied(row, col, gameBoard)) {
                    keepAsking = false;
                }
                else {
                    System.out.println("The cell is already occupied");
                }
            }
        }

        if(xTurn) {
            gameBoard[row][col] = "X";
        }
        else {
            gameBoard[row][col] = "O";
        }
    }
    private boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
    }

    private String getWinner(String[][] gameBoard) {
        final int ROWS = gameBoard.length;
        final int COLS = gameBoard[0].length;

        // checking rows
        for(int i = 0; i<ROWS; ++i) {
            if(!gameBoard[i][0].equals(" ")
                    && gameBoard[i][0].equals(gameBoard[i][1])
                    && gameBoard[i][1].equals(gameBoard[i][2])) {
                return gameBoard[i][0];
            }
        }

        // checking columns
        for(int i = 0; i<COLS; ++i) {
            if (!gameBoard[0][i].equals(" ")
                    && gameBoard[0][i].equals(gameBoard[1][i])
                    && gameBoard[1][i].equals(gameBoard[2][i])) {
                return gameBoard[0][i];
            }
        }

        // checking diagonals

        // checking backward diagonal
        if(!gameBoard[0][0].equals(" ")
                && gameBoard[0][0].equals(gameBoard[1][1])
                && gameBoard[1][1].equals(gameBoard[2][2])) {
            return gameBoard[0][0];
        }

        // checking forward diagonal
        if(!gameBoard[2][0].equals(" ")
                && gameBoard[2][0].equals(gameBoard[1][1])
                && gameBoard[1][1].equals(gameBoard[0][2])) {
            return gameBoard[2][0];
        }

        // no winner yet
        return "";
    }
    private boolean isBoardFull(String[][] gameBoard) {
        int countFill = 0;
        for(int i = 0; i< gameBoard.length; ++i) {
            for(int j = 0; j<gameBoard[i].length; ++j) {
                if(!gameBoard[i][j].equals(" ")) {
                    countFill++;
                }
            }
        }

        return countFill == 9;
    }
}

public class Project_6_2_TicTacToe {

    public static void main(String[] args) {
        TicTacToeGameController game = new TicTacToeGameController();
        game.runGame();
    }



}
