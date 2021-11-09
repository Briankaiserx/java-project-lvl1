package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;

public class Prime {

    public static final String RUNGAME = "Prime";
    static final String RULESGAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static String[] game() {
        int number = generateRandom(MAX_NUMBER);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = Integer.toString(number);
        questionAndAnswer[1] = isPrime(number) ? "yes" : "no";

        return questionAndAnswer;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[Engine.LIMIT_CORRECT_ANSWERS][0];
        for (int i = 0; i < Engine.LIMIT_CORRECT_ANSWERS; i++) {
            questionAndAnswers[i] = game();
        }
        Engine.start(questionAndAnswers, RULESGAME);
    }
}
