package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class PrimeGame {

    public static final int MAX_VALUE = 100;

    public static boolean startGame(String name) {
        var number = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println("Question: " + number);
        System.out.print("Your choice: ");
        var answer = Cli.getInputText();
        var result = isPrimeNumber(number);
        var textResult = result ? "no" : "yes";
        if (answer.equals(textResult)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was '" + textResult + "'.");
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
