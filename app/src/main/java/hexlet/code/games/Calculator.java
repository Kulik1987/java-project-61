package hexlet.code.games;

import hexlet.code.Cli;

public class Calculator {
    public static boolean startGame(String name) {
        var firstValue = (int) (Math.random() * 100);
        var secondValue = (int) (Math.random() * 100);
        var operationType = (int) (Math.random() * 3);
        String operation;
        int result;
        if (0 == operationType) {
            operation = "+";
            result = firstValue + secondValue;
        } else if (1 == operationType) {
            operation = "-";
            result = firstValue - secondValue;
        } else {
            operation = "*";
            result = firstValue * secondValue;
        }
        System.out.println("Question: " + firstValue + " " + operation + " " + secondValue);
        System.out.print("Your answer: ");
        var answer = Cli.getInputText();
        if (result == Integer.parseInt(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + name);
            return false;
        }
    }
}
