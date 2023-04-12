package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Cli.getInputText;

public class PrimeGame {

    public static final int MAX_VALUE = 100;

    public static void getBeforeGameMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.controlGame(name, "6");
    }

    public static boolean startGame(String name) {
        var number = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println(number);
        var result = isPrimeNumber(number);
        String correctResult = result ? "no" : "yes";

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

    private static boolean isPrimeNumber(int number) {
        int firstValue = number / 2;
        for (int i = firstValue; i > 1; i--) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
