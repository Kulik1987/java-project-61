package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class NodGame {

    public static final int MAX_VALUE = 100;

    public static int startGame() {
        var firstValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var secondValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println(firstValue + " " + secondValue);

       return findNod(firstValue, secondValue);

    }

    private static int findNod(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findNod(n2, n1 % n2);
    }
}
