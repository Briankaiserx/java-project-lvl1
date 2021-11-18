package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Utils.MAX_NUMBER;

public class GCD {

    public static final String GCD = "GCD";
    static final String RULESGAME = "Find the greatest common divisor of given numbers.";


    private static String takeResult(int firstNumber, int secondNumber) {
        int differences = Math.max(firstNumber, secondNumber) - Math.min(firstNumber, secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);
        if (minNumber == 0) {
            return String.valueOf(differences);
        } else {
            while (differences != minNumber) {
                firstNumber = differences;
                differences = Math.max(differences, minNumber) - Math.min(differences, minNumber);
                minNumber = Math.min(firstNumber, minNumber);
            }
            return String.valueOf(minNumber);
        }
    }

    public static void start() {
        Random rn = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = rn.nextInt(MAX_NUMBER);
            int secondNumber = rn.nextInt(MAX_NUMBER);
            questions[i] = firstNumber + " " + secondNumber;
            answers[i] = takeResult(firstNumber, secondNumber);
        }
        Engine.start(new String[][]{questions, answers}, RULESGAME);
    }
}
