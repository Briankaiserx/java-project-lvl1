package hexlet.code;

import java.util.Scanner;


public class Cli {

    private static String name;
    public static void welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? ");
        name = scanner.nextLine();
    }

    public static String get() {
        return name;
    }
}
