package hexlet.code;

import hexlet.code.games.ArithmeticProgressionGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NodGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;


public class Engine {

    public static final int MAX_COUNT_GAME = 3;

    public static void beforeGame(String typeGame) {
        if ("1".equals(typeGame)) {
            getBeforeGameMessage();
        } else if ("2".equals(typeGame)) {
            String name = getBeforeGameMessage();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            Engine.controlGame(name, "2");
        } else if ("3".equals(typeGame)) {
            String name = getBeforeGameMessage();
            System.out.print("What is the result of the expression?");
            Engine.controlGame(name, "3");
        } else if ("4".equals(typeGame)) {
            String name = getBeforeGameMessage();
            System.out.print("Find the greatest common divisor of given numbers.");
            Engine.controlGame(name, "4");
        } else if ("5".equals(typeGame)) {
            String name = getBeforeGameMessage();
            System.out.print("What number is missing in the progression?");
            Engine.controlGame(name, "5");
        } else if ("6".equals(typeGame)) {
            String name = getBeforeGameMessage();
            System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            Engine.controlGame(name, "6");
        }
    }

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

    private static String getBeforeGameMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    private static String getInputText() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
