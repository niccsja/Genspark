import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class DragonTest {
    public static Scanner scanner = new Scanner(System.in);
    Dragons dragon;

    @BeforeEach
    void setUp() {
        dragon = new Dragons();
    }

    @Test
    void prompt() {
    assertEquals("Which cave will you go into?(1 or 2)", dragon.prompt(), "invalid output");
    }

    @Test
    void getUserInput() {
        assertEquals(1, dragon.getUserInput(scanner), "incorrect input");
    }

    @AfterEach
    void tearDown() {

    }


}
