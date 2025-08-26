package JavaTutoApps;
import java.util.Scanner;

public class WeightConverter_15 {
    public WeightConverter_15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();
        System.out.println("What system is this weight in? (1/2)");
        System.out.println("1. kilograms");
        System.out.println("2. pounds");

//        switch (sc.nextInt()) {
//            case 1:
//                System.out.printf("%f kg is %f lbs", weight, weight*2.204);
//                break;
//            case 2:
//                System.out.printf("%f lbs is %f kg", weight, weight/2.204);
//        }

//        switch(sc.nextInt()) {
//            case 1 -> System.out.printf("%f kg is %f lbs", weight, weight*2.204);
//            case 2 -> System.out.printf("%f lbs is %f kg", weight, weight/2.204);
//            default -> System.out.println("Invalid input");
//        }

        String response = switch (sc.nextInt()) {
            case 1 -> String.format("%.2f kg is %.2f lbs", weight, weight * 2.204);
            case 2 -> String.format("%.2f lbs is %.2f kg", weight, weight / 2.204);
            default -> "Invalid input";
        }; // print returns PrintStream, not String, thats why you have to build the string

        System.out.println(response);
        sc.close();
    }
}
