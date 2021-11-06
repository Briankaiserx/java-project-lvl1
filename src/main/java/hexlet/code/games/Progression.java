package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_NUMBER;

public class Progression {

    public static final String RUNGAME = "Progression";
    static final String RULESGAME = "What number is missing in the progression?";


    public static String[] game() {
        System.out.println("What number is missing in the progression?");
        final int delta = 5;
        final int sizeLimit = 30;
        final int progreLimit = 10;

        int startOfNumber = getRandomNumber(MAX_NUMBER);
        int step = getRandomNumber(sizeLimit) + 1;
        int numOfProgre = getRandomNumber(progreLimit) + delta;

        String[] question = new String[numOfProgre];

        for (int i = 0; i < numOfProgre; i++) {
            int currentNumber = startOfNumber + step * i;
            question[i] = Integer.toString(currentNumber);
        }

        int indexOfHiddenElement = getRandomNumber(numOfProgre);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[1] = question[indexOfHiddenElement];
        question[indexOfHiddenElement] = "..";
        questionAndAnswer[0] = "".join(" ", question);

        return questionAndAnswer;

    }

    public static int getRandomNumber(int number) {
        return (int) (Math.random() * number);
    }


    public static void start() {
        String[][] questionAndAnswers = new String[Engine.LIMIT_CORRECT_ANSWERS][0];
        for (int i = 0; i < Engine.LIMIT_CORRECT_ANSWERS; i++) {
            questionAndAnswers[i] = game();
        }
        Engine.start(questionAndAnswers, RULESGAME);
    }
}
