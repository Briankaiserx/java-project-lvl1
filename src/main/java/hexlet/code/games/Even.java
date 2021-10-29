package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Even implements Engine {

    private static String answer;
    private static String correctAnswer;
    private static int number;


    public void runGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random rn = new Random();
            number = rn.nextInt(MAX_NUMBER);
           System.out.println("Question: " + number);
           System.out.print("Your answer: ");
           Scanner scanner = new Scanner(System.in);
           answer = scanner.nextLine();
            if (number % 2 == 0 & answer.equals("yes")
                    | number % 2 == 1 & answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                wrong();
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.get() + "!");
    }

    public void wrong() {
        if (answer.equals("yes")) {
            correctAnswer = "no";
        } else if (answer.equals("no")) {
            correctAnswer = "yes";
        }
        System.out.print("'" + answer + "'" + " is wrong answer :(. Correct answer was '" + correctAnswer
                + "'.\nLet's try again, " + Cli.get() + "!\n");
    }
}
