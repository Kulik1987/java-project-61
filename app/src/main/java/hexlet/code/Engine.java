package hexlet.code;

import hexlet.code.games.ArithmeticProgressionGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NodGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;


public class Engine {

    public static final int MAX_COUNT_GAME = 3;

    public static void controlGame(String name, String typeGame) {
        var count = 0;
        boolean isTrueDecision = true;
        while (count < MAX_COUNT_GAME && isTrueDecision) {
            System.out.print("Question: ");
            if ("2".equals(typeGame)) {
                String correctResult = EvenGame.startGame();
                isTrueDecision = resultProcessing(correctResult, name);
                count++;
            } else if ("3".equals(typeGame)) {
                int correctResult = Calculator.startGame();
                isTrueDecision = resultProcessing(correctResult, name);
                count++;
            } else if ("4".equals(typeGame)) {
                int correctResult = NodGame.startGame();
                isTrueDecision = resultProcessing(correctResult, name);
                count++;
            } else if ("5".equals(typeGame)) {
                int correctResult = ArithmeticProgressionGame.startGame();
                isTrueDecision = resultProcessing(correctResult, name);
                count++;
            } else if ("6".equals(typeGame)) {
                String correcrResult = PrimeGame.startGame();
                isTrueDecision = resultProcessing(correcrResult, name);
                count++;
            }
            if (count == MAX_COUNT_GAME) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }

    private static boolean resultProcessing(int correctResult, String name) {
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

    private static boolean resultProcessing(String correctResult, String name) {
        System.out.print("Your choice: ");
        var response = Cli.getInputText();
        if (correctResult.equals(response)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + response
                + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }

    private static String getInputText() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
