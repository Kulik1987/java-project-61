package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Cli.getInputText;

public class ArithmeticProgressionGame {
    public static final int SIZE_ARRAY = 10;
    public static final int MAX_VALUE = 100;
    public static final int MAX_STEP = 20;

    public static void getBeforeGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        Engine.controlGame(name, "5");
    }

    public static boolean startGame(String name) {
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
        int correctResult = progressive[findElement];
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
