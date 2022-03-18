import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class hangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        String word = "crawl";

        List<Character> guesses = new ArrayList<>();
        int wrongGuesses = 0;
        List<String> missedLetters = new ArrayList<>();
        String missedString = missedLetters.toString();


        display(wrongGuesses, missedLetters);
        System.out.println("This is the missed string "+missedString);

        gamePlay(keyboard, word, guesses, wrongGuesses, missedLetters);
    }

    private static void gamePlay(Scanner keyboard, String word, List<Character> guesses, int wrongGuesses, List<String> missedLetters) {
        boolean play = true;

        while (true) {
            printWordState(word, guesses);
            if (!getPlayerGuess(keyboard, word, guesses, missedLetters)) {
                wrongGuesses++;
            }
            if (printWordState(word, guesses)) {
                break;
            }
            ;
            display(wrongGuesses, missedLetters);
        }
        System.out.println("Yes! The secret word is " + word + " You have won!");
        System.out.println("Do you want to play again?(yes or no)");
        String ans = keyboard.nextLine();
        if (ans.equals("no")) {
            play = false;
            System.out.println("The game has ended.");
        } else
        {
            guesses.removeAll(guesses);
            display(wrongGuesses, missedLetters);
            gamePlay(keyboard, word, guesses, wrongGuesses, missedLetters);
        }
    }

    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> guesses, List<String> missedLetter) {
        System.out.println("Guess a letter: ");
        String input = keyboard.nextLine();

        if(guesses.contains(input.charAt(0))) {
            System.out.println("You have already guessed that letter. Choose again.");
            getPlayerGuess(keyboard, word, guesses, missedLetter);
        } guesses.add(input.charAt(0));

        if(!word.contains(input)) {
            missedLetter.add(input);
        }
        return word.contains(input);
    }

    private static void display(int userGuess, List<String> missed) {
        gameLogic art = new gameLogic();
        System.out.println("HANGMAN");

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

        System.out.println("Missed letters: "+missed);

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
