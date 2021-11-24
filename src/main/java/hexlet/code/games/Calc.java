package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc extends Utils {

    public static final String CALC = "Calc";
    static final String RULES_GAME = "What is the result of the expression?";
    private static final char[] OPERARORS = {'+', '-', '*'};

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstOperand = generateRandom(MAX_NUMBER);
            int secondOperand = generateRandom(MAX_NUMBER);
            char operator = OPERARORS[generateRandom(OPERARORS.length)];
            String answer = String.valueOf(takeResult(operator, firstOperand, secondOperand));
            questions[i] = firstOperand + " " + operator + " " + secondOperand;
            answers[i] = answer;
        }
        Engine.start(new String[][]{questions, answers}, RULES_GAME);
    }


    private static int takeResult(char operator, int a, int b) {
        switch (operator) {
            case ('-'):
                return a - b;
            case ('+'):
                return a + b;
            default:
                return a * b;
        }
    }
}
