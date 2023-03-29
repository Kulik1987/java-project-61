package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class NodGame {

    public static final int MAX_VALUE = 100;

    public static boolean startGame(String name) {
        var firstValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var secondValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println("Question: " + firstValue + " " + secondValue);
        System.out.print("Your answer: ");
        var answer = Cli.getInputText();
        var result = findNod(firstValue, secondValue);

        if (result == Integer.parseInt(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was '" + result + "'.");
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
