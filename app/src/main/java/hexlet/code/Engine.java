package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Nod;

public class Engine {
    public static void controlGame(String name, String typeGame) {
        var count = 0;
        boolean isTrueDecision = true;
        while (count < 3 && isTrueDecision) {
            if ("2".equals(typeGame)) {
                isTrueDecision = EvenGame.startEvenGame(name);
                count++;
            } else if ("3".equals(typeGame)) {
                isTrueDecision = Calculator.getNumber(name);
                count++;
            } else if ("4".equals(typeGame)) {
                isTrueDecision = Nod.startGame(name);
                count++;
            }
            if (count == 3) {
                System.out.println("Congratulations, " + name);
            }
        }
    }
}
