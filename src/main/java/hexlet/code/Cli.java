package hexlet.code;

import java.util.Scanner;


public final class Cli {

    public static void greetings() {
        String name;
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
    }

}
