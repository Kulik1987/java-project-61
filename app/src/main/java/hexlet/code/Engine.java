package hexlet.code;

import hexlet.code.games.ArithmeticProgressionGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NodGame;
import hexlet.code.games.PrimeGame;

import static hexlet.code.Cli.getInputText;


public class Engine {

    public static final int MAX_COUNT_GAME = 3;


    public static void beforeGame() {
        String typeGame = getInputText();
        if ("1".equals(typeGame)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name?");
            String name = getInputText();
            System.out.println();
            System.out.println("Hello, " + name + "!");
        } else if ("2".equals(typeGame)) {
            EvenGame.getBeforeGameMessage();
        } else if ("3".equals(typeGame)) {
            Calculator.getBeforeGameMessage();
        } else if ("4".equals(typeGame)) {
            NodGame.getBeforeGameMessage();
        } else if ("5".equals(typeGame)) {
           ArithmeticProgressionGame.getBeforeGame();
        } else if ("6".equals(typeGame)) {
            PrimeGame.getBeforeGameMessage();
        }
    }

    public static void controlGame(String name, String typeGame) {
        var count = 0;
        boolean isTrueDecision = true;
        while (count < MAX_COUNT_GAME && isTrueDecision) {
            System.out.print("Question: ");
            count++;
            if ("2".equals(typeGame)) {
                isTrueDecision = EvenGame.startGame(name);
            } else if ("3".equals(typeGame)) {
                isTrueDecision = Calculator.startGame(name);
            } else if ("4".equals(typeGame)) {
                isTrueDecision = NodGame.startGame(name);
            } else if ("5".equals(typeGame)) {
                isTrueDecision = ArithmeticProgressionGame.startGame(name);
            } else if ("6".equals(typeGame)) {
                isTrueDecision = PrimeGame.startGame(name);
            }

            if (count == MAX_COUNT_GAME) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
