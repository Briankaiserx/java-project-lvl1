package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;


public class Even {


    public static final String EVEN = "Even";
    static final String RULESGAME = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = generateRandom(MAX_NUMBER);
            questions[i] = String.valueOf(number);
            answers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.start(new String[][]{questions, answers}, RULESGAME);
    }
}
