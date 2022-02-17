import java.util.Scanner;

public class Dragons {

    public String prompt(){
        return "Which cave will you go into?(1 or 2)";
    }

    public String end() {
        return "You approach the cave...\n" +
                "It is dark and spooky\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!";
    }

    public int getUserInput(Scanner scanner) {
        return scanner.nextInt();
    }
}
