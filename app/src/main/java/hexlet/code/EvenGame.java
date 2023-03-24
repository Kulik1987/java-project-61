package hexlet.code;

public class EvenGame {
    public static void beforeEvenGame(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        startEvenGame(name);
    }

    private static void startEvenGame(String name) {
        var count = 0;
        while (count < 3) {
            var firstValue = (int) (Math.random() * 100);
            var correctResult = firstValue % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + firstValue);
            System.out.print("Your choice: ");
            var response = Cli.getInputText();
            if (correctResult.equals(response)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + response
                    + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
                System.out.println("Let's try again, " + name);
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}

