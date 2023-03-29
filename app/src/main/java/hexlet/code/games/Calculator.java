package hexlet.code.games;

import hexlet.code.Cli;

import java.util.concurrent.ThreadLocalRandom;

public class Calculator {

    public static final int MAX_VALUE = 100;
    public static final int TYPE_OPERATION = 2;

    public static boolean startGame(String name) {
        var firstValue =  ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var secondValue =  ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var operationType =  ThreadLocalRandom.current().nextInt(0, TYPE_OPERATION + 1);
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
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }
}
