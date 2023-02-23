import java.util.Scanner;

public class GuessNumber {

    public static void start() {
        System.out.println("Game guess the number started");
    }

    public static void end() {
        System.out.println("Game is completed");
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100);
    }

    public static void guessTheNumber() {
        int currentNumber = 0;
        int randomNumber = randomNumber();
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        while (currentNumber != randomNumber) {
            System.out.println("Guess the number: ");
            currentNumber = scanner.nextInt();
            if (counter == 3) {
                break;
            }
            if (currentNumber > randomNumber) {
                System.out.println("Number is greater than random number");
            } else if (currentNumber < randomNumber) {
                System.out.println("Number is lower than random number");
            } else {
                System.out.println("You are correct");
                return;
            }
            counter++;
        }
        System.out.println("You did not guess random number was " + randomNumber);

    }

    public static void main(String[] args) {
        start();
        guessTheNumber();
        end();
    }
}
