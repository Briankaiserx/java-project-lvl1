package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int LIMIT_CORRECT_ANSWERS = 3;
    public static final int MAX_NUMBER = 100;

    public static String howUare() {
        String name;
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
        return name;
    }

    public static void start(String[][] questionsAndAnswers, String description) {
        String playerName = howUare();

        System.out.println(description);

        Scanner answ = new Scanner(System.in);

        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            String playerAnswer = answer();

            if (questionsAndAnswers[i][1].equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
    private static String answer() {
        Scanner answ = new Scanner(System.in);
        System.out.print("Your answer: ");
        return answ.nextLine();
    }
}

