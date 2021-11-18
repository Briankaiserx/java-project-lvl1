package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;


public class Calc {

    public static final String CALC = "Calc";
    static final String RULESGAME = "What is the result of the expression?";
    private static final char[] OPERARORS = {'+', '-', '*'};

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstOperand = generateRandom(MAX_NUMBER);
            int secondOperand = generateRandom(MAX_NUMBER);
            int index = generateRandom(MAX_NUMBER);
            questions[i] = firstOperand + " " + OPERARORS[index] + " " + secondOperand;
            answers[i] = takeResult(firstOperand, secondOperand, index);
        }
        Engine.start(new String[][]{questions, answers}, RULESGAME);
    }

    private static String takeResult(int firstNumber, int secondNumber, int index) {

        switch (OPERARORS[index]) {
            case ('-'):
                return String.valueOf(firstNumber - secondNumber);
            case ('+'):
                return String.valueOf(firstNumber + secondNumber);
            default:
                return String.valueOf(firstNumber * secondNumber);
        }
    }
}
