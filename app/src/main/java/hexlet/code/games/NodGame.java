package hexlet.code.games;

import hexlet.code.Cli;

public class NodGame {
    public static boolean startGame(String name) {
        var firstValue = (int) (Math.random() * 100);
        var secondValue = (int) (Math.random() * 100);
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
