package JavaTutoApps;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser_22 {
    public NumberGuesser_22() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int rand = random.nextInt(1, 11);

        System.out.println("Welcome to number guessing game.");
        System.out.printf("Guess a number between %d-%d.\n", min, max);

        do {
            System.out.println("Take a guess: ");
            guess = sc.nextInt();
            attempts++;
            if(guess>rand) {
                System.out.println("Guess too high!");
            }
            else if (guess<rand){
                System.out.println("Guess too low!");
            }
        } while (guess != rand);

        System.out.printf("You've guessed it in %d tries.", attempts);

        sc.close();
    }
}
