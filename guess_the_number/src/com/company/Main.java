package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args) throws IndexOutOfBoundsException{
        String ans = "y";
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int guessTarget = random.nextInt(21);
        int guessAmount = 1;
        while(ans.equals("y")) {

            int guess;
            System.out.println("Hello, What is your name?");
            String userName = in.nextLine();
            System.out.println("Well, " +userName+ " , I am thinking of a number between 1 and 20");
            System.out.println("take a guess");
             guess = in.nextInt();

            while(guess != guessTarget) {

                if(guess > 20 || guess < 1) {
                    guessAmount++;
                    System.out.println("Guess isn't within range");
                    System.out.println("Take a guess");
                    guess = in.nextInt();
                    throw new IndexOutOfBoundsException("Num greater than bounds");
                }
                else if(guess > guessTarget) {
                    guessAmount++;
                    System.out.println("Your guess is too high");
                    System.out.println("Take a guess");
                    guess = in.nextInt();

                } else if(guess < guessTarget) {
                    guessAmount++;
                    System.out.println("Your guess is too low");
                    System.out.println("Take a guess");
                    guess = in.nextInt();

                }
            }
            System.out.println("Good job " +userName+ " You guessed in "+guessAmount+ " guesses");
            System.out.println("Would you like to play again?(y/n)");
            ans = in.nextLine();
        }
    }
}


