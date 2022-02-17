import java.util.Scanner;

public class Dragon {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Dragons dragon = new Dragons();
        System.out.println("You are in a land full of Dragons. In front of you," +
                "you see two caves. In one cave, the dragon is friendly " +
                "and will share his treasure with you. The other dragon " +
                "is greedy and hungry and will eat you on sight.");
        System.out.println(dragon.prompt());

        if(dragon.getUserInput(scanner) == 1) {
            System.out.println(dragon.end());
        } else System.out.println("You survived");
    }

}


