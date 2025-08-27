package JavaTutoClasses;
import java.util.Scanner;

public class While_21 {
    public While_21() {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String response = "";
        int num = 6;

        while (name.isEmpty()) {
            System.out.println("Please provide your name: ");
            name = sc.nextLine();
        }

//        while(!response.equals("Q")) {
//            System.out.printf("Hello %s. You're playing a 'Q' game. ", name);
//            System.out.print("Press Q to quit: ");
//            response = sc.next().toUpperCase();
//        }
//
//        System.out.println("You've just quit.");

        int guess;
        do {
            System.out.println("Enter a number between 1 and 10: ");
            guess = sc.nextInt();
            if (num != guess) {
                System.out.println("Guess again.");
            } else {
                System.out.println("You've guessed right!");
            }
        } while (guess != num);

        sc.close();
    }
}
