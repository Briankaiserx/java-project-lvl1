package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.LIMIT_CORRECT_ANSWERS;
import static hexlet.code.Engine.MAX_NUMBER;

public class Even {

    public static final String RUNGAME = "Even";
    static final String RULESGAME = "Answer 'yes' if number even otherwise answer 'no'.";
    private static int number;


    public static String[] game() {
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random rn = new Random();
            number = rn.nextInt(MAX_NUMBER);
        }
        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = Integer.toString(number);
        questionAndAnswer[1] = number % 2 == 0 ? "yes" : "no";

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
