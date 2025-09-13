package JavaTutoClasses;

import java.util.Scanner;

public class TwoDimArrays_35 {
    static String[] fruits = {"apple", "pineapple", "mango"};
    static String[] vegetables = {"potato", "tomato", "carrot"};
    static String[] meats = {"chicken", "pork", "beef", "fish"};
    static Scanner sc = new Scanner(System.in);

    static String[][] groceries = {fruits, vegetables, meats};

    public TwoDimArrays_35() {
        printGroceries();
        swapElement();
    }

    public void printGroceries() {
        System.out.println("Current list of groceries: ");
        for (String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + ", ");
            }
            System.out.println();
        }
    }

    public void swapElement() {
        System.out.println("Enter row to alter: ");
        int row = sc.nextInt() - 1; sc.nextLine();
        System.out.println("Enter column to alter: ");
        int column = sc.nextInt() - 1; sc.nextLine();
        System.out.println("Enter name of the grocery to insert: ");
        String newGroceryName = sc.nextLine();
        String oldGroceryName = groceries[row][column];

        groceries[row][column] = newGroceryName;
        System.out.printf("Swapped %s for %s", oldGroceryName, newGroceryName);

        printGroceries();

        System.out.println("Do you want to swap other ingredient? (y/n)");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            swapElement();
        }
    }

}
