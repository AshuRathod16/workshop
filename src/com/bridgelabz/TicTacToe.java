package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    public static char[] gameArray = new char[10];
    public static char playerTurn;
    public static char computerTurn;
    public static char user = '1';
    public static Scanner scanner = new Scanner(System.in);

    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac program");
        showBoard();
        userChoice();

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

}
