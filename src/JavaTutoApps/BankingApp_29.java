package JavaTutoApps;
import java.util.Scanner;

public class BankingApp_29 {
    static Scanner sc = new Scanner(System.in);
    static double balance = 0;
    static boolean isRunning = true;
    public BankingApp_29() {
        printInitialInfo();
        while (isRunning) {

            printInfo();
            handleChoice();
        }
    }

    public void printInitialInfo() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$ Hello. Welcome to the banking app. $");
    }

    public void printInfo() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$ Please select action:");
        System.out.println("$ 1. Show balance");
        System.out.println("$ 2. Deposit");
        System.out.println("$ 3. Withdraw");
        System.out.println("$ 4. Exit");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public void handleChoice() {
        int choice = sc.nextInt();
        switch(choice) {
            case 1 -> showBalance();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> isRunning = false;
        }
    }

    public void showBalance() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("Your balance is: %.2f%n", balance);
    }

    public void deposit() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Enter the amount to deposit: ");
        double toDeposit = sc.nextDouble();
        if (toDeposit < 0) {
            System.out.println("You can't add negative value to your balance");
        }
        else {
            balance = balance + toDeposit;
            System.out.printf("You've added %.2f to your balance. Now you have %.2f in your account", toDeposit, balance);
        }
    }

    public void withdraw() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Enter the amount to withdraw: ");
        double toWithdraw = sc.nextDouble();
        if (balance < toWithdraw) {
            System.out.printf("You don't have this much money in your account. You currently have %.2f in your account%n", balance);
        }
        else {
            balance = balance - toWithdraw;
            System.out.printf("You've withdrawn %.2f from you account. You have %.2f left.", toWithdraw, balance);
        }
    }

    // horrendous code but im not putting it in my beautiful main method
}
