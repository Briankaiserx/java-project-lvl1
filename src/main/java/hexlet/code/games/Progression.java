package hexlet.code.games;

import hexlet.code.Engine;


import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.generateRandom;

public class Progression {


    public static final String PROGRESSION = "Progression";
    static final String RULESGAME = "What number is missing in the progression?";
    public static final int LENGTH_OF_PROGRESSION = 10;

    public static String generateQuestion(int[] array, int missingPos) {
        StringBuilder arrayStr = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i == missingPos) {
                arrayStr.append(".. ");
            } else {
                arrayStr.append(array[i]).append(" ");
            }
        }
        return arrayStr.toString();
    }


    public static int[] getProgression(int step, int firstElement, int length) {
        int[] array = new int[length];
        array[0] = firstElement;
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] + step;
        }
        return array;
    }


    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            int progressionStep = generateRandom(LENGTH_OF_PROGRESSION);
            int firstElem = generateRandom(LENGTH_OF_PROGRESSION);
            int[] array = getProgression(progressionStep, firstElem, LENGTH_OF_PROGRESSION);
            int missingPos = generateRandom(LENGTH_OF_PROGRESSION - 1);
            questions[i] = generateQuestion(array, missingPos);
            answers[i] = String.valueOf(array[missingPos]);
        }
        Engine.start(new String[][]{questions, answers}, RULESGAME);
    }
}
