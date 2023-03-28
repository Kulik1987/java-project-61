package hexlet.code.games;

import hexlet.code.Cli;

public class EvenGame {
    public static boolean startGame(String name) {
        var firstValue = (int) (Math.random() * 100);
        var correctResult = firstValue % 2 == 0 ? "yes" : "no";
        System.out.println("Question: " + firstValue);
        System.out.print("Your choice: ");
        var response = Cli.getInputText();
        if (correctResult.equals(response)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + response
                + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
            System.out.println("Let's try again, " + name);
            return false;
        }
    }
}

