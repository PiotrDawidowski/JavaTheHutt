package JavaTutoApps;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors_37 {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    static String[] possibleChoices = {"rock", "paper", "scissors"};
    static String computersChoice;
    static boolean isFinished = false;

    public RockPaperScissors_37() {
        mainLogic();
    }

    public void printInterface() {
        System.out.println("Welcome to the game. Choose one (word):");
        System.out.println("1. rock");
        System.out.println("2. paper");
        System.out.println("3. scissors");
    }

    public void mainLogic() {
        do {
            printInterface();
            System.out.println("Please enter your choice: ");
            String usersChoice = sc.nextLine();

            if(!usersChoice.equals("rock") && !usersChoice.equals("paper") && !usersChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }
            System.out.println("Your choice: " + usersChoice);
            computersChoice = possibleChoices[rand.nextInt(3)];
            System.out.println("Computers choice: " + computersChoice);

            if(computersChoice.equals(usersChoice)) {
                System.out.println("It's a tie!");
            }
            else if ((usersChoice.equals("rock") && computersChoice.equals("scissors")) ||
                    (usersChoice.equals("scissors") && computersChoice.equals("paper")) ||
                    (usersChoice.equals("paper") && computersChoice.equals("rock"))) {
                System.out.println("You win");
            }
            else {
                System.out.println("YOu lose...");
            }
        } while(!isFinished);
    }
}
