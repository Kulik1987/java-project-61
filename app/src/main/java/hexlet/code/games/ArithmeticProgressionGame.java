package hexlet.code.games;

import java.util.concurrent.ThreadLocalRandom;

public class ArithmeticProgressionGame {
    public static final int SIZE_ARRAY = 10;
    public static final int MAX_VALUE = 100;
    public static final int MAX_STEP = 20;

    public static int startGame() {
        int[] progressive = getProgressive();
        var findElement = ThreadLocalRandom.current().nextInt(0, SIZE_ARRAY);
        for (int i = 1; i < SIZE_ARRAY; i++) {
            if (findElement == i && i != SIZE_ARRAY - 1) {
                System.out.print(".. ");
            } else if (findElement == i) {
                System.out.print("..");
            } else if (i == SIZE_ARRAY - 1) {
                System.out.print(progressive[i]);
            } else {
                System.out.print(progressive[i] + " ");
            }
        }
        return progressive[findElement];
    }

    private static int[] getProgressive() {
        int[] progressive = new int[SIZE_ARRAY];
        progressive[0] = ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var step = ThreadLocalRandom.current().nextInt(1, MAX_STEP + 1);
        for (int i = 1; i < SIZE_ARRAY; i++) {
            progressive[i] = progressive[i - 1] + step;
        }
        return progressive;
    }
}
