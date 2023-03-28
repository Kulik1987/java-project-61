package hexlet.code.games;

import hexlet.code.Cli;

public class ArithmeticProgressionGame {
    public static boolean startGame(String name) {
        int[] progressive = new int[10];
        progressive[0] =  (int) (Math.random() * 100);
        var step =  (int) (Math.random() * 20);
        for (int i = 1; i < 10; i++) {
            progressive[i] = progressive[i - 1] + step;
        }
        var findElement = (int) (Math.random() * 10);
        System.out.print("Question: ");
        for (int i = 1; i < 10; i++) {
            if (findElement == i) {
                System.out.print(".. ");
            } else {
                System.out.print(progressive[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Your answer: ");
        var answer = Cli.getInputText();
        if (Integer.parseInt(answer) == progressive[findElement]) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was '" + progressive[findElement] + "'.");
            System.out.println("Let's try again, " + name);
            return false;
        }
    }
}
