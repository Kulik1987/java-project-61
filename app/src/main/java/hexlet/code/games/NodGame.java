package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Cli.getInputText;

public class NodGame {

    public static final int MAX_VALUE = 100;

    public static void getBeforeGameMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.print("Find the greatest common divisor of given numbers.");
        Engine.controlGame(name, "4");
    }

    public static boolean startGame(String name) {
        var firstValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var secondValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println(firstValue + " " + secondValue);
        int correctResult = findNod(firstValue, secondValue);

        System.out.println();
        System.out.print("Your answer: ");
        var answer = getInputText();
        if (correctResult == Integer.parseInt(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }

    private static int findNod(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findNod(n2, n1 % n2);
    }
}
