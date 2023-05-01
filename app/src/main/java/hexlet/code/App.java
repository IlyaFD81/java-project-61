package hexlet.code;

import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner playerChoice = new Scanner(System.in, UTF_8);
        String actualChoice = playerChoice.nextLine();
        boolean sucessGame = false;
        boolean exitChoice = false;
        String playerName = "Player";
        switch (actualChoice) {
            case "1" -> playerName = Cli.greeting();
            case "2" -> {
                playerName = Cli.greeting();
                sucessGame = Games.startEven();
            }
            case "0" -> {
                exitChoice = true;
                sucessGame = true;
            }
            default -> System.out.println("Wrong choice");
        }
        if (sucessGame) {
            System.out.print(exitChoice ? "Goodbye, " : "Congratulations, ");
            System.out.println(playerName + "!");
        } else if (!actualChoice.equals("1"))  {
            System.out.println("Try again, " + playerName + "!");
        }
    }
}
