package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Cli.getInputText;

public class EvenGame {

    public static final int MAX_VALUE = 100;

    public static void getBeforeGameMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.controlGame(name, "2");
    }

    public static boolean startGame(String name) {
        var firstValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println(firstValue);
        String correctResult = firstValue % 2 == 0 ? "yes" : "no";
        System.out.print("Your choice: ");
        var response = getInputText();
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

