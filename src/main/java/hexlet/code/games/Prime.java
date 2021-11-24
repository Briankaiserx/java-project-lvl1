package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;

public class Prime {

    public static final String PRIME = "Prime";
    static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = number / 2; i > 1; i--) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
    }
    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = generateRandom(MAX_NUMBER);
            questions[i] = String.valueOf(number);
            answers[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.start(new String[][]{questions, answers}, RULES_GAME);
    }
}
