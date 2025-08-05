package JavaTutoClasses;
import java.util.Scanner;

public class If_7 {
    public If_7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Are you a student?");
        boolean isStudent = sc.nextBoolean();
        sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("Name is empty");
        }
        else { System.out.println("Hello, " + name + "!"); }

        if (age < 0) {
            System.out.println("You weren't born yet!");
        }
        else if (age == 0) {
            System.out.println("You're a baby!");
        }
        else if (age < 18) {
            System.out.println("You're not of age!");
        }
        else if (age <= 40) {
            System.out.println("You're almost an unc!");
        }
        else { System.out.println("Now youre old.."); }

        if (isStudent) {
            System.out.println("You're a student!");
        }
        else { System.out.println("You're not a student!"); }
    }
}
