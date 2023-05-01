package hexlet.code;
import java.util.Random;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Games {
    public static boolean startEven() {
        Scanner playerAnswer = new Scanner(System.in, UTF_8);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random randomNumber = new Random();
        var number = 0;
        for ( int i = 0 ; i < 3; i++) {
            number = randomNumber.nextInt(1000);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = playerAnswer.nextLine();
            if (((number & 1) == 0) && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if ((number & 1) == 0)  {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                return false;
            } else if (((number & 1) == 1) && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else if ((number & 1) == 1) {
                System.out.println("'yew' is wrong answer ;(. Correct answer was 'no'.");
                return false;
            }
        }
        return true;
    }
}
