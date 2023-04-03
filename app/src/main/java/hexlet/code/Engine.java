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
            if ("2".equals(typeGame)) {
                isTrueDecision = EvenGame.startGame(name);
                count++;
            } else if ("3".equals(typeGame)) {
                isTrueDecision = Calculator.startGame(name);
                count++;
            } else if ("4".equals(typeGame)) {
                isTrueDecision = NodGame.startGame(name);
                count++;
            } else if ("5".equals(typeGame)) {
                isTrueDecision = ArithmeticProgressionGame.startGame(name);
                count++;
            } else if ("6".equals(typeGame)) {
                isTrueDecision = PrimeGame.startGame(name);
                count++;
            }
            if (count == MAX_COUNT_GAME) {
                System.out.println("Congratulations, " + name + "!");
            }
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
