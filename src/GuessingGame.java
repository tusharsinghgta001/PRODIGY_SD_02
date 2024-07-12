import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100. Can you guess what it is?");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        System.out.println("It took you " + attempts + " attempts to guess the correct number.");
        scanner.close();
    }
}
