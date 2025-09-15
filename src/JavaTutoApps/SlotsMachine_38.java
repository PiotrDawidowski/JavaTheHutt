package JavaTutoApps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotsMachine_38 {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    static double balance = 100;
    static double bet;
    static boolean firstRoll = true;
    static String[] result = new String[3];
    static String[] possibleResults = {"🍒", "🍉", "🍋", "🔔", "⭐"};
    static boolean isQuitting = false;
    public SlotsMachine_38() {
        // present starting HUD: view balance
        // ask for how much player wants to bet
        // no pairs: lose, pair: twice, three same: 10x
        // after every roll present current balance and ask for a rerun
        do {
            startingHUD();
            takeInBet();
            machineRoll();
            calculate();
            playAgain();
        } while (!isQuitting);
    }

    public void startingHUD() {
        if (firstRoll) {
            System.out.println("**********************************");
            System.out.println("*      Welcome to the game.      *");
            System.out.println("**********************************");
            System.out.println("* Your starting balance is 100$. *");
            System.out.println("**********************************");
            firstRoll = false;
        }
        else {
            System.out.println("*********************************");
            System.out.println("*         Welcome  back         *");
            System.out.println("*********************************");
            System.out.println("* Your current balance is 100$. *");
            System.out.println("*********************************");
        }
    }

    public void takeInBet() {
        System.out.println("Please provide bet: ");
        bet = sc.nextDouble();
        sc.nextLine();
        if (bet > balance) {
            System.out.printf("Bet too big. Please provide number smaller than %.2f.%n", balance);
            takeInBet();
        }
        else if (bet <= 0) {
            System.out.println("Bet too small. Please provide number bigger than 0.");
        }
    }

    public void machineRoll() {
        System.out.println("Rolling...");
        for (int i = 0; i < result.length; i++) {
            result[i] = possibleResults[rand.nextInt(5)];
        }
        System.out.println("Your roll:");
        System.out.println("*********************");
        System.out.println("* " +  Arrays.toString(result) + " *");
        System.out.println("*********************");
    }

    public void calculate() {
        if (result[0].equals(result[1]) && result[0].equals(result[2])) {
            System.out.printf("You've won %.2f$!%n", bet * 10);
            balance += bet * 10;
        }
        else if (result[0].equals(result[1]) || result[1].equals(result[2])) {
            System.out.printf("You've won %.2f$!%n", bet * 2);
            balance += bet * 2;
        }
        else {
            System.out.println("You LOST!");
            balance -= bet;
        }
        System.out.printf("Your current balance is %.2f%n", balance);
    }

    public void playAgain() {
        System.out.println("Wanna play again? (y/n)");
        if(sc.next().charAt(0) == 'n') {
            isQuitting = true;
        }
    }
}
