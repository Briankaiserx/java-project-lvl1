package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

static final String[] GAMENAME = {"Exit", "Greet", Even.EVEN, Calc.CALC, GCD.GCD, Progression.PROGRESSION, Prime.PRIME};

    public static void main(String[] args) {
        String[] menu = printMenu();
        System.out.println("Please enter the game number and press Enter.");
        Scanner read = new Scanner(System.in);
        System.out.print("Your choice: ");
        int select = read.nextInt();

        switch (menu[select]) {
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
        public static String[] printMenu() {
        for (int i = 1; i < GAMENAME.length; i++) {
                System.out.println(i + " - " + GAMENAME[i]);
            }
            System.out.println("0 - " + GAMENAME[0]);
            return GAMENAME;
        }
    }

