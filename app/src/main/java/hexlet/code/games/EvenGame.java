package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class EvenGame {

    public static final int MAX_VALUE = 100;

    public static boolean startGame(String name) {
        var firstValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var correctResult = firstValue % 2 == 0 ? "yes" : "no";
        System.out.println("Question: " + firstValue);
        System.out.print("Your choice: ");
        var response = Cli.getInputText();
        if (correctResult.equals(response)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + response
                + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }
}

