package JavaTutoClasses;
import java.util.Scanner;

public class LogicalOps_20 {
    public LogicalOps_20() {
        // && AND
        // || OR
        // != NOT

//        double temp = 25;
//        boolean isSunny = true;
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;

//        if (temp <= 30 && temp > 20 && isSunny) {
//            System.out.println("The weather is good.");
//            System.out.println("it is sunny outside.");
//        }
//        else if (temp <= 30 && temp > 20 && !isSunny) {
//            System.out.println("The weather is good.");
//            System.out.println("it is NOT sunny outside.");
//        }
//        else if (temp > 30 || temp < 0) {
//            System.out.println("It's cold...");
//        }

        // username must be 8-12 characters long
        // username must not contain spaces or underscores

        String username;
        System.out.println("Enter username: ");
        username = sc.nextLine();

        if(username.indexOf(' ') == -1 || username.indexOf('_') == -1) {
            System.out.println("Username must not contain spaces or underscores");
        }
        else if(username.length() > 12 || username.length() < 8) {
            System.out.println("Username must contain between 8 and 12 characters");
        }
        else { System.out.println("Welcome, "+username); }
        sc.close();
    }
}
