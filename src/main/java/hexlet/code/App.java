package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] gameNames = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        for (int i = 1; i < gameNames.length; i++) {
            System.out.println(i + " - " + gameNames[i]);
        }
        System.out.println("0 - " + gameNames[0]);
        Scanner read = new Scanner(System.in);
        System.out.print("Your choice: ");
        int select = read.nextInt();
        switch (gameNames[select]) {
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
}
