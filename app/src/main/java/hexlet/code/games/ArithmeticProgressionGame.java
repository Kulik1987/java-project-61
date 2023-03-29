package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class ArithmeticProgressionGame {
    public static boolean startGame(String name) {
        int[] progressive = new int[10];
        progressive[0] =  ThreadLocalRandom.current().nextInt(0, 101);
        var step =  ThreadLocalRandom.current().nextInt(1, 21);
        for (int i = 1; i < 10; i++) {
            progressive[i] = progressive[i - 1] + step;
        }
        var findElement = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.print("Question: ");
        for (int i = 1; i < 10; i++) {
            if (findElement == i && i != 9) {
                System.out.print(".. ");
            } else if (findElement == i && i == 9) {
                System.out.print("..");
            } else if (findElement != i && i == 9) {
                System.out.print(progressive[i]);
            } else {
                System.out.print(progressive[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Your answer: ");
        var answer = Cli.getInputText();
        System.out.println("");
        if (Integer.parseInt(answer) == progressive[findElement]) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was '" + progressive[findElement] + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }
}
