package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;


    public static void start(String[][] questionsAndAnswers, String description) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
        System.out.println(description);

        for (int i = 0; i < ROUNDS; i++) {
            String question = questionsAndAnswers[0][i];
            String answer = questionsAndAnswers[1][i];
            System.out.println("Question: " + question);
            String playerAnswer = getAnswer();
            if (answer.equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static String getAnswer() {
        Scanner answ = new Scanner(System.in);
        System.out.print("Your answer: ");
        return answ.nextLine();
    }
}

