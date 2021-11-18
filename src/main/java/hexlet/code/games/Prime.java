package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;

public class Prime {

    public static final String PRIME = "Prime";
    static final String RULESGAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String isPrime(int number) {
        if (number == 2) {
            return "yes";
        } else if (number % 2 == 0) {
            return "no";
        } else {
            int i = number / 2;
            while (i != 1) {
                if (number % i == 0) {
                    return "no";
                }
                i += -1;
            }
            return "yes";
        }
    }

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = generateRandom(MAX_NUMBER);
            questions[i] = String.valueOf(number);
            answers[i] = isPrime(number);
        }
        Engine.start(new String[][]{questions, answers}, RULESGAME);
    }
}
