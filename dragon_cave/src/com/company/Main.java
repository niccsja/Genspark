package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("You are in a land full of Dragons. In front of you," +
                "you see two caves. In one cave, the dragon is friendly " +
                "and will share his treasure with you. The other dragon " +
                "is greedy and hungry and will eat you on sight.");
        try {
            System.out.println("which cave will you go into?");
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();

            if(s == 1) {
                System.out.println("You approach the cave..." +
                        "It is dark and spooky..." +
                        "A large dragon jumps out in front of you! He opens his jaws and..."+
                        "Gobbles you down in one bite!");
            } else System.out.println("null");
        } catch (Exception e) {
            System.out.println("Caught Exception: Input");
        }
    }
}
