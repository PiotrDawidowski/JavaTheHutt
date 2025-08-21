package JavaTutoClasses;
import java.util.Scanner;

public class Strings_13 {
    public Strings_13() {
        Scanner sc = new Scanner(System.in);
        String name = "     Piotr Dawidowski       ";
        int length = name.length();
        System.out.printf("There are %d letters in your name", length);

        System.out.println("which char would you like to see?");
        int charNum =  sc.nextInt() - 1;
        sc.nextLine();
        char character = name.charAt(charNum);
        System.out.printf("The character at %d is %c", charNum, character);

        int indexOf = name.indexOf('r'); // index of first occurrence
        int lastIndexOf = name.lastIndexOf('r'); // index of last occurrence

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();

        name = name.replace("o", "a");

        if (name.isEmpty()){
            System.out.print("String with the name is empty");
        }
        else {
            System.out.printf("Hello, " + name + "!");
        }

        if (name.contains(" ")) {
            System.out.print("The name contains spaces");
        }
        else {
            System.out.print("Your name doesnt contain spaces.");
        }

        if (name.equals("password")) { // can use equalsIgnoreCase instead, so chars will be checked without case sensitivity
            System.out.print("Your name can't be password");
        }
        else {
            System.out.print("Hello, " + name + "!");
        }
    }
}
