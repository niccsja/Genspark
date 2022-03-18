import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        String word = "adjacent";

        List<Character> guesses = new ArrayList<>();
        int wrongGuesses = 0;

        display();



        while(true) {
            printWordState(word, guesses);
            getPlayerGuess(keyboard, word, guesses);
            if(printWordState(word, guesses)){
                break;
            };
            display();
        }
        System.out.println("Yes! The secret word is "+word+ " You have won!");
        System.out.println("Do you want to play again?(yes or no)");

    }

    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> guesses) {
        System.out.println("Guess a letter: ");
        String input = keyboard.nextLine();

        if(guesses.contains(input.charAt(0))) {
            System.out.println("You have already guessed that letter. Choose again.");
            getPlayerGuess(keyboard, word, guesses);
        } guesses.add(input.charAt(0));
        return word.contains(input);
    }

    private static void display() {

        System.out.println("HANGMAN");
        System.out.println("+--+\n"+
                "   |\n"+
                "   |\n"+
                "   |\n"+
        "  ===");

    }


    private static boolean printWordState(String word, List<Character> guesses) {
        int count = 0;

        for (int i = 0; i < word.length() ; i++) {
            if(guesses.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                count++;
            } else {
                System.out.print("-");


            }
        }
        System.out.println();
        return (count == word.length());
    }
}
