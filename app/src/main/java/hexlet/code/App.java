package hexlet.code;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - NOD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String numberGame = Cli.getInputText();

        if ("1".equals(numberGame)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.getInputText();
            System.out.println("Hello, " + name);
        } else if ("2".equals(numberGame)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.getInputText();
            System.out.println("Hello, " + name);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            Engine.controlGame(name, "2");
        } else if ("3".equals(numberGame)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.getInputText();
            System.out.println("Hello, " + name);
            System.out.print("What is the result of the expression?");
            Engine.controlGame(name, "3");
        } else if ("4".equals(numberGame)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.getInputText();
            System.out.println("Hello, " + name);
            System.out.print("Find the greatest common divisor of given numbers.");
            Engine.controlGame(name, "4");
        }
    }
}
