package hexlet.code;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - NOD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String numberGame = Cli.getInputText();

        if ("1".equals(numberGame)) {
            getBeforeGameMessage();
        } else if ("2".equals(numberGame)) {
            String name = getBeforeGameMessage();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            Engine.controlGame(name, "2");
        } else if ("3".equals(numberGame)) {
            String name = getBeforeGameMessage();
            System.out.print("What is the result of the expression?");
            Engine.controlGame(name, "3");
        } else if ("4".equals(numberGame)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.getInputText();
            System.out.println("Hello, " + name);
            System.out.print("Find the greatest common divisor of given numbers.");
            Engine.controlGame(name, "4");
        } else if ("5".equals(numberGame)) {
            String name = getBeforeGameMessage();
            System.out.print("What number is missing in the progression?");
            Engine.controlGame(name, "5");
        } else if ("6".equals(numberGame)) {
            String name = getBeforeGameMessage();
            System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            Engine.controlGame(name, "6");
        }
    }

    private static String getBeforeGameMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = Cli.getInputText();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
