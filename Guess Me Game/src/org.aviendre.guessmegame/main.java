package org.aviendre.guessmegame;

import java.util.Random;
import java.util.Scanner;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Guess Me!");
        System.out.println("May I have your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("\nHello " + name);

        System.out.println("\nShall we start?");
        System.out.println("\t1. Yes \n \t2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1){
            System.out.println("\nShall we start?");
            System.out.println("\t1. Yes \n \t2. No");
            
            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Please guess a number: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timesTried++;

            if(timesTried < 5){
                if(userInput == x){
                    hasWon = true;
                    shouldFinish = true;

                } else if(userInput > x){
                    System.out.println("Guess a lower number");
                    userInput = scanner.nextInt();
                } else {
                    System.out.println("Guess a higher number");
                    userInput = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }

        if (hasWon)
            System.out.println("Congratulations! You have guessed the number in your " + timesTried + "guess");
        else
            System.out.println("\nGame over!\nThe number was " + x);


    }
}
