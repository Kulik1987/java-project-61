package hexlet.code;

import hexlet.code.games.ArithmeticProgressionGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NodGame;
import hexlet.code.games.PrimeGame;

public class Engine {

    public static final int MAX_COUNT_GAME = 3;

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
}
