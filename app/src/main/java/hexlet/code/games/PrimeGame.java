package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class PrimeGame {

    public static final int MAX_VALUE = 100;

    public static String startGame() {
        var number = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println(number);

        var answer = Cli.getInputText();
        var result = isPrimeNumber(number);
        return result ? "no" : "yes";
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
