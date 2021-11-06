package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int LIMIT_CORRECT_ANSWERS = 3;
    public static final int MAX_NUMBER = 100;

    public static void start(String[][] questionsAndAnswers, String description) {
        String playerName = Cli.read();

        System.out.println(description);

        Scanner answ = new Scanner(System.in);

        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String answer = answ.next();

            if (questionsAndAnswers[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
