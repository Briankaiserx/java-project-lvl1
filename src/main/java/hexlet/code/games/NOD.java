package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class NOD implements Engine {


    private static int answer;
    private static int correctAnswer;
    private static int firstNumber;
    private static int secondNumber;


    public void runGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random rn = new Random();
            firstNumber = rn.nextInt(MAX_NUMBER);
            secondNumber = rn.nextInt(MAX_NUMBER);
            correctAnswer = solution(firstNumber, secondNumber);
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            if (correctAnswer == answer) {
                System.out.println("Correct!");
            } else {
                wrong();
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.get() + "!");
    }

    public void wrong() {
        System.out.print("'" + answer + "'" + " is wrong answer :(. Correct answer was '" + correctAnswer
                + "'.\nLet's try again, " + Cli.get() + "!\n");
    }

    public static int solution(int a, int b) {
        int result = 0;
        if (a == b) {
            result = a;
        } else if (a == 0 | b == 0) {
            result = Math.max(a, b);
        }
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arrayListA.add(i);
            }
        }
        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
                arrayListB.add(j);
            }
        }
        for (int i = 0; i < arrayListA.size(); i++) {
            for (int j = 0; j < arrayListB.size(); j++) {
                if (arrayListA.get(i) == arrayListB.get(j)) {
                    result = arrayListA.get(i);
                }
            }
        }
        return result;
    }
}
