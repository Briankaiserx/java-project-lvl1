package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Prime implements Engine {

    private String answer;
    private String correctAnswer;
    private int number;

    public void runGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random rn = new Random();
            number = rn.nextInt(MAX_NUMBER);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (isPrime(number) & answer.equals("yes")
                    | !isPrime(number) & answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                this.wrong();
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.get() + "!");
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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

