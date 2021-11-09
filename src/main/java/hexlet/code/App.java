package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.NOD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] gameNames = {"Exit", "Greet", "Even", "Calc", "NOD", "Progression", "Prime"};
        for (int i = 1; i < gameNames.length; i++) {
            System.out.println(i + " - " + gameNames[i]);
        }
        System.out.println("0 - " + gameNames[0]);
        Scanner read = new Scanner(System.in);
        System.out.print("Your choice: ");
        int select = read.nextInt();
        switch (gameNames[select]) {
            case Even.RUNGAME:
                Even.start();
                break;
            case Calc.RUNGAME:
                Calc.start();
                break;
            case NOD.RUNGAME:
                NOD.start();
                break;
            case Progression.RUNGAME:
                Progression.start();
                break;
            case Prime.RUNGAME:
                Prime.start();
                break;
            case "Greet":
                Cli.greetings();
            default:
                break;
        }

    }
}
