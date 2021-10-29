package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Calc implements Engine {

    private static int answer;
    private static int correctAnswer;

    private static int firstOperand;
    private static int secondOperand;
    private static char[] operators = {'+', '-', '*'};
    private static char operator;


    public void runGame() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random rn = new Random();
            firstOperand = rn.nextInt(MAX_NUMBER);
            secondOperand = rn.nextInt(MAX_NUMBER);
            operator = operators[rn.nextInt(operators.length)];
            correctAnswer = solution(firstOperand, secondOperand, operator);
            System.out.println("Question: " + firstOperand + " " + operator + " " + secondOperand);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            if (correctAnswer == answer) {
                System.out.println("Correct!");
            } else {
                wrong();
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.get() + "!");
    }

    public void wrong() {
        System.out.print("'" + answer + "'" + " is wrong answer :(. Correct answer was '" + correctAnswer
                + "'.\nLet's try again, " + Cli.get() + "!\n");
    }


    private int solution(int x, int y, char operation) {
        int result = 0;
        switch (operation) {
            case ('-'):
                return x - y;
            case ('+'):
                return x + y;
            default:
                return x * y;
        }

        }
    }
