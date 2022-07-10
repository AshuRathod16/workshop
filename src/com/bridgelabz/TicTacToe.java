package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    public static char[] gameArray = new char[10];
    public static char user = '1';
    public static char userTurn;
    public static int userPos;
    public static int computerPos;
    public static char computerTurn;

    public static Scanner scanner = new Scanner(System.in);

    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac program");
        ticTacToeGame();
        showBoard();
        userChoice();
        moveLocation();
        computerMove();

    }

    // method to show board
    public static void showBoard() {
        System.out.println(gameArray[0] + "|" + gameArray[1] + "|" + gameArray[2]);
        System.out.println(gameArray[3] + "|" + gameArray[4] + "|" + gameArray[5]);
        System.out.println(gameArray[6] + "|" + gameArray[7] + "|" + gameArray[8]);
    }

    //  choose x or 0
    public static char userChoice() {
        System.out.println("Enter your choice -> (X or 0) only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void ticTacToeGame() {

        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = ' ';
        }
    }

    // method to move to valid cell
    public static void moveLocation() {
        if (user == '1') {
            System.out.print("\nSelect the position in board from range [1 - 9] : ");
            userPos = scanner.nextInt();

            switch (userPos) {
                case 1:
                    if (gameArray[1] == ' ') {
                        gameArray[1] = userTurn;
                    }
                    break;

                case 2:
                    if (gameArray[2] == ' ') {
                        gameArray[2] = userTurn;
                    }
                    break;

                case 3:
                    if (gameArray[3] == ' ') {
                        gameArray[3] = userTurn;
                    }
                    break;

                case 4:
                    if (gameArray[4] == ' ') {
                        gameArray[4] = userTurn;
                    }
                    break;

                case 5:
                    if (gameArray[5] == ' ') {
                        gameArray[5] = userTurn;
                    }
                    break;

                case 6:
                    if (gameArray[6] == ' ') {
                        gameArray[6] = userTurn;
                    }
                    break;

                case 7:
                    if (gameArray[7] == ' ') {
                        gameArray[7] = userTurn;
                    }
                    break;

                case 8:
                    if (gameArray[8] == ' ') {
                        gameArray[8] = userTurn;
                    }
                    break;

                case 9:
                    if (gameArray[9] == ' ') {
                        gameArray[9] = userTurn;
                    }
                    break;

                default:
                    System.out.println("Invalid Position");
            }
        }
    }

    public static void computerMove() {
        boolean flag = false;
        while (true) {
            computerPos = (int) (Math.random() * 8);
            switch (computerPos) {
                case 1:
                    if (gameArray[1] == ' ') {
                        gameArray[1] = computerTurn;
                        flag = true;
                    }
                    break;
                case 2:
                    if (gameArray[2] == ' ') {
                        gameArray[2] = computerTurn;
                        flag = true;
                    }
                    break;
                case 3:
                    if (gameArray[3] == ' ') {
                        gameArray[3] = computerTurn;
                        flag = true;
                    }
                    break;
                case 4:
                    if (gameArray[4] == ' ') {
                        gameArray[4] = computerTurn;
                        flag = true;
                    }
                    break;
                case 5:
                    if (gameArray[5] == ' ') {
                        gameArray[5] = computerTurn;
                        flag = true;
                    }
                    break;
                case 6:
                    if (gameArray[6] == ' ') {
                        gameArray[6] = computerTurn;
                        flag = true;
                    }
                    break;
                case 7:
                    if (gameArray[7] == ' ') {
                        gameArray[7] = computerTurn;
                        flag = true;
                    }
                    break;
                case 8:
                    if (gameArray[8] == ' ') {
                        gameArray[8] = computerTurn;
                        flag = true;
                    }
                    break;
                case 9:
                    if (gameArray[9] == ' ') {
                        gameArray[9] = computerTurn;
                        flag = true;
                    }
                    break;
            }
            if (flag){
                break;
            }
        }
    }
}

