package hexlet.code.games;

import hexlet.code.Engine;


import static hexlet.code.Utils.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;

public class Progression {

    public static final String PROGRESSION = "Progression";
    static final String RULESGAME = "What number is missing in the progression?";
    private static String answer;

    private static int[] progression() {
        final int delta = 5;
        final int sizeLimit = 30;
        final int progreLimit = 10;
        int startOfNumber = generateRandom(MAX_NUMBER);
        int step = generateRandom(sizeLimit) + 1;
        int numOfProgre = generateRandom(progreLimit) + delta;

        int[] question = new int[numOfProgre];

        for (int i = 0; i < numOfProgre; i++) {
            int currentNumber = startOfNumber + step * i;
            question[i] = currentNumber;
        }

        return question;
    }

    private static String getQuestions(int[] question) {
        int positionOfAnswer = generateRandom(question.length - 1);
        answer = String.valueOf(question[positionOfAnswer]);

        StringBuilder stringProgression = new StringBuilder();
        for (int i = 0; i < question.length; i++) {
            if (i == positionOfAnswer) {
                stringProgression.append("..");
            } else {
                stringProgression.append(question[i]).append(" ");
            }
        }
        return stringProgression.toString();
    }

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = getQuestions(progression());
            answers[i] = answer;
        }
        Engine.start(new String[][]{questions, answers}, RULESGAME);
    }
}
