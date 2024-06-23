import java.util.Scanner;
import java.util.Random;
public class Main  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int n = random.nextInt(100) + 1;
            int g = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I have chosen a number between 1 and 100.");
            System.out.println("Can you guess it?");
            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int r = scanner.nextInt();
                g++;

                if (r< 1 || r> 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (r< n) {
                    System.out.println("Your guess is too low.");
                } else if (r> n) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("It took you " + n + " tries.");
                    hasGuessedCorrectly = true;
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);
        scanner.close();
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}