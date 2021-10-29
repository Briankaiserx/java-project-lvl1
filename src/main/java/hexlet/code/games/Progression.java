package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Progression implements Engine {

    private int hiddenPosition;
    private int[] array;
    private int answer;
    private int index;
    private int correctAnswer;

    public void runGame() {
        System.out.println("What number is missing in the progression?");
        final int delta = 5;
        final int sizeLimit = 30;
        final int progreLimit = 10;
        for (int i = 0; i < LIMIT_CORRECT_ANSWERS; i++) {
            Random ran = new Random();
            int startOfNumber = ran.nextInt(MAX_NUMBER);
            int step = ran.nextInt(sizeLimit) + 1;
            int numOfProgre = ran.nextInt(progreLimit) + delta;
            System.out.print("Question: ");
            solution(startOfNumber, step, numOfProgre);
            System.out.println("\nYour answer:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            correctAnswer = array[index];
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
            public void solution(int a, int b, int c) {
                array = new int[c];
                for (int i = 0; i < c; i++) {
                    array[i] = a + b * i;
                }
                Random ran = new Random();
                index = ran.nextInt(c - 1);
                for (int i = 0; i < index; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.print("..");
                for (int i = index + 1; i < c; i++) {
                    System.out.print(" " + array[i]);
                }
            }
        }
