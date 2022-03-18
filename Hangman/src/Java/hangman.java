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

        display(wrongGuesses);



        while(true) {
            printWordState(word, guesses);
           if(!getPlayerGuess(keyboard, word, guesses)){
               wrongGuesses++;
           }
            if(printWordState(word, guesses)){
                break;
            };
            display(wrongGuesses);
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

    private static void display(int userGuess) {
        gameLogic art = new gameLogic();
        System.out.println("HANGMAN");
       /* System.out.println("+--+\n"+
                "   |\n"
                "   |\n"+
                "   |\n"+
        "  ===");*/
        if(userGuess == 0) {
            System.out.println(art.hangmanArt()[0]);
        } else if(userGuess == 1) {
            System.out.println(art.hangmanArt()[1]);
        }else if(userGuess == 2) {
            System.out.println(art.hangmanArt()[2]);
        }else if(userGuess == 3) {
            System.out.println(art.hangmanArt()[3]);
        }else if(userGuess == 4){
            System.out.println(art.hangmanArt()[4]);
        }else if(userGuess ==5) {
            System.out.println(art.hangmanArt()[5]);
        } else {
            System.out.println(art.hangmanArt()[userGuess - 1]);
        }


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
