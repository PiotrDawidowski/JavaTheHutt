package JavaTutoClasses;
import java.util.Scanner;
import java.util.Arrays;

public class Scanner_3 {
    public Scanner_3() { // It will work with current main when its a constructor not void

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your GPA?: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean student = scanner.nextBoolean();

        scanner.close(); // good practice

        String result = resultBuilder(name,age,gpa,student);

        System.out.println(result);
    }

    public String resultBuilder(String name, int age, double gpa, boolean student) {
        String resultAge = (age >= 18) ? "of age." : "NOT of age.";
        String resultStudent = (student == true) ? "are enrolled" : "are NOT enrolled";
        String resultString = "Hello, " + name + ". As of now, you're " + age + " years old, which means you're " + resultAge + " your GPA is " + gpa + ", and you " + resultStudent + "!";
        return resultString;
    }

    // Because of input buffer, when we type in number (25), then hit enter, within the input buffer theres still \n because nextInt() takes in 25 and not \n that is being added by pressing enter. Then \n goes into nextLine() in line 44 and then color input is \n. You fix it by adding nextLine after taking in nextInt().
    public void problemWithN() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // this fixes \n going down the line :]

        System.out.println("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color);

    }
}

//        String name = scanner.next(); // if you dont want any spaces