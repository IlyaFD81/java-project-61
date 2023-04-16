package hexlet.code;

import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Cli {

    public static String getName() {
        Scanner in = new Scanner(System.in, UTF_8);
        System.out.print("May I have your name? ");
        return in.nextLine();
    }
}
