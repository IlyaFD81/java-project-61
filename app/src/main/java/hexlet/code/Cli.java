package hexlet.code;

import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Cli {

    public static String getName() {
        Scanner playerName = new Scanner(System.in, UTF_8);
        System.out.print("May I have your name? ");
        return playerName.nextLine();
    }
    public static String greeting() {
        System.out.println("Welcome to the Brain Games !");
        String returnedName = Cli.getName();
        System.out.println("Hello, " + returnedName + " !");
        return returnedName;
    }
}
