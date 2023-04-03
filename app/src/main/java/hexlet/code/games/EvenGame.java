package hexlet.code.games;

import java.util.concurrent.ThreadLocalRandom;

public class EvenGame {

    public static final int MAX_VALUE = 100;

    public static String startGame() {
        var firstValue = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        System.out.println(firstValue);
        return firstValue % 2 == 0 ? "yes" : "no";
    }
}

