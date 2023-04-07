package hexlet.code.games;

import java.util.concurrent.ThreadLocalRandom;

public class Calculator {

    public static final int MAX_VALUE = 100;
    public static final int TYPE_OPERATION = 2;

    public static int startGame() {
        var firstValue =  ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var secondValue =  ThreadLocalRandom.current().nextInt(0, MAX_VALUE + 1);
        var operationType =  ThreadLocalRandom.current().nextInt(0, TYPE_OPERATION + 1);
        return getResult(operationType, firstValue, secondValue);
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
