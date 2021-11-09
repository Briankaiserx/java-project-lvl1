package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Utils.generateRandom;

public class Progression {

    public static final String RUNGAME = "Progression";
    static final String RULESGAME = "What number is missing in the progression?";


    public static String[] game() {
        final int delta = 5;
        final int sizeLimit = 30;
        final int progreLimit = 10;

        int startOfNumber = generateRandom(MAX_NUMBER);
        int step = generateRandom(sizeLimit) + 1;
        int numOfProgre = generateRandom(progreLimit) + delta;

        String[] question = new String[numOfProgre];

        for (int i = 0; i < numOfProgre; i++) {
            int currentNumber = startOfNumber + step * i;
            question[i] = Integer.toString(currentNumber);
        }

        int indexOfHiddenElement = generateRandom(numOfProgre);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[1] = question[indexOfHiddenElement];
        question[indexOfHiddenElement] = "..";
        questionAndAnswer[0] = "".join(" ", question);

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
