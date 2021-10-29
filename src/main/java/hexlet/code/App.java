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
        System.out.print(" 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - NOD \n "
                + "5 - Progression \n 6 - Prime \n 0 - Exit \n Your choice: ");

        Even even = new Even();
        Calc calc = new Calc();
        NOD nod = new NOD();
        Progression progression = new Progression();
        Prime prime = new Prime();
        Scanner read = new Scanner(System.in);
        String choice = read.nextLine();
        switch (choice) {
            case "0":
                System.out.println("Exit");
                break;
            case "1":
                break;
            case "2":
                even.runGame();
                break;
            case "3":
                calc.runGame();
                break;
            case "4":
                nod.runGame();
                break;
            case "5":
                progression.runGame();
                break;
            case "6":
                prime.runGame();
                break;
            default:
                System.out.println("wrong number :( ");
        }

    }
}
