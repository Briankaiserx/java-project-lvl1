package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

static final String[] GAME_NAMES = {
        "Exit",
        "Greet",
        Even.EVEN,
        Calc.CALC,
        GCD.GCD,
        Progression.PROGRESSION,
        Prime.PRIME};

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        printMenu();
        Scanner read = new Scanner(System.in);
        System.out.print("Your choice: ");
        int select = read.nextInt();

        switch (GAME_NAMES[select]) {
            case Even.EVEN:
                Even.start();
                break;
            case Calc.CALC:
                Calc.start();
                break;
            case GCD.GCD:
                GCD.start();
                break;
            case Progression.PROGRESSION:
                Progression.start();
                break;
            case Prime.PRIME:
                Prime.start();
                break;
            case "Greet":
                Cli.greetings();
            default:
                break;
        }
    }

    public static void printMenu() {
        for (int i = 1; i < GAME_NAMES.length; i++) {
            System.out.println(i + " - " + GAME_NAMES[i]);
        }
        System.out.println("0 - " + GAME_NAMES[0]);
    }
}

