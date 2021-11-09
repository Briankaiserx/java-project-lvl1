package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.LIMIT_CORRECT_ANSWERS;
import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;


public class Calc {

    public static final String RUNGAME = "Calc";
    static final String RULESGAME = "What is the result of the expression?";

    public static String[] game() {
        int firstOperand;
        int secondOperand;
        char[] operators = {'+', '-', '*'};
        firstOperand = generateRandom(MAX_NUMBER);
        secondOperand = generateRandom(MAX_NUMBER);
        char operator = operators[generateRandom(operators.length)];
        String answer = String.valueOf(takeResult(operator, firstOperand, secondOperand));

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = firstOperand + " " + operator + " " + secondOperand;
        questionAndAnswer[1] = answer;

        return questionAndAnswer;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[LIMIT_CORRECT_ANSWERS][0];
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            questionAndAnswers[i] = game();
        }
        Engine.start(questionAndAnswers, RULESGAME);
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
