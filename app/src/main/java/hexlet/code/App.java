package hexlet.code;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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
            EvenGame.beforeEvenGame(name);
        }
    }

    private static void startedMessage() {

    }
}
