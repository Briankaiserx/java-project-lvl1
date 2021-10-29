package hexlet.code;

import java.util.Scanner;


public final class Cli {


    private static String name;

    public static void read() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
    }

    public static String get() {
        return name;
    }

}
