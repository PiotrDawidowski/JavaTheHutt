package JavaTutoApps;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCart_6 {
    public ShoppingCart_6() {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';

        System.out.println("What item would you like to buy? ");
        item = sc.nextLine();

        System.out.println("What is the orice per piece? ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.println("What is the quantity? ");
        quantity = sc.nextInt();
        sc.nextLine();

        double total = price * quantity;
        System.out.println("Your total is $" + total + " for " + quantity + " " + item + ".");

        sc.close();
    }
}