package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

import static hexlet.code.Cli.getInputText;

public class Calculator {

    public static final int MAX_VALUE = 100;
    public static final int TYPE_OPERATION = 2;

    public static void getBeforeGameMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.print("What is the result of the expression?");
        Engine.controlGame(name, "3");
    }

    public static boolean startGame(String name) {
        var firstValue =  ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var secondValue =  ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var operationType =  ThreadLocalRandom.current().nextInt(0, TYPE_OPERATION + 1);
        int correctResult = getResult(operationType, firstValue, secondValue);
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

    private static int getResult(int operationType, int firstValue, int secondValue) {
        String operation;
        int result;
        if (0 == operationType) {
            operation = "+";
            System.out.print(firstValue + " " + operation + " " +  secondValue);
            return firstValue + secondValue;
        } else if (1 == operationType) {
            operation = "-";
            result = firstValue - secondValue;
        } else {
            operation = "*";
            result = firstValue * secondValue;
        }
        System.out.print(firstValue + " " + operation + " " + secondValue);
        return result;
    }
}
