package hexlet.code;

import java.util.Scanner;


public final class Cli {


    private static String name;

    public static String read() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
        return name;
    }

}

