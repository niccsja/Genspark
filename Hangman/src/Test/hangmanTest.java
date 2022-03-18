import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
public class hangmanTest {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Character> testList = new ArrayList<>(){{
        add('c');
    }};
    ArrayList<String> missedTest = new ArrayList<>();
    hangman Hangman;
    @BeforeEach
    void setUp() {
        Hangman = new hangman();
    }

    @Test
    void getPlayerGuess() {
        String input = "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(true, Hangman.getPlayerGuess(scanner, "cat",testList ,missedTest), "Incorrect value");
        String testScan = scanner.nextLine();
    }

}
