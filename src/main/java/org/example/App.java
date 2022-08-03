package org.example;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int ScorePlayer = 0;
        int ScoreComputer = 0;

        while (ScorePlayer != 3 && ScoreComputer != 3) {

            switch (gameRound(playerChoice(), random.nextInt(3) + 1)) {
                case 1:
                    ScorePlayer++;
                    break;

                case 2:
                    ScoreComputer++;
                    break;
            }
            ;
            System.out.println("Score Player : " + ScorePlayer + " --- " + "Score Computer : " + ScoreComputer);
            if (ScorePlayer == 3) {
                System.out.println("****************   You win the party  ****************");
            } else if (ScoreComputer == 3) {
                System.out.println("******************   Computer win the party   ***************");
            } else {

            }
        }


    }

    public static int playerChoice() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 for Rock");
            System.out.println("2 for Paper");
            System.out.println("3 for Scissors");
            System.out.println("Entry your choice : ");
            choice = input.nextInt();
        } while (choice > 3 || choice < 1);
        return choice;
    }


    public static String playerSelection(int choice) {
        String object = null;
        switch (choice) {
            case 1:
                object = "Rock";
                break;

            case 2:
                object = "Paper";
                break;

            case 3:
                object = "Scissors";
                break;


        }
        return object;
    }


    public static int gameRound(int playerChoice, int computerChoice) {
        int result;

        System.out.println("Your Choice is " + playerSelection(playerChoice) + " And the choice of Compunter is : " + playerSelection(computerChoice));


        if (playerChoice == 1 && computerChoice == 3 || playerChoice == 2 && computerChoice == 1 || playerChoice == 3 && computerChoice == 2) {
            System.out.println("You win this round");
            result = 1;

        } else if (playerChoice == computerChoice) {
            System.out.println("It's a draw no winners");
            result = 0;
        } else {
            System.out.println("Computer win this round");

            result = 2;

        }
        return result;
    }
};


