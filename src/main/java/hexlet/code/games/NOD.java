package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.LIMIT_CORRECT_ANSWERS;
import static hexlet.code.Engine.MAX_NUMBER;

public class NOD {

    public static final String RUNGAME = "NOD";
    static final String RULESGAME = "Find the greatest common divisor of given numbers.";

    private static int firstNumber;
    private static int secondNumber;


    public static String[] game() {
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random rn = new Random();
            firstNumber = rn.nextInt(MAX_NUMBER);
            secondNumber = rn.nextInt(MAX_NUMBER);
        }
        String[] questionAndAnswer = new String[2];
        questionAndAnswer[0] = firstNumber + " " + secondNumber;


        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }

        questionAndAnswer[1] = Integer.toString(firstNumber + secondNumber);

        return questionAndAnswer;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[Engine.LIMIT_CORRECT_ANSWERS][0];
        for (int i = 0; i < Engine.LIMIT_CORRECT_ANSWERS; i++) {
            questionAndAnswers[i] = game();
        }
        Engine.start(questionAndAnswers, RULESGAME);
    }
}
