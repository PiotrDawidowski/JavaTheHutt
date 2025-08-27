package JavaTutoClasses;
import java.util.Scanner;

public class EnhSwitch_18 {
    public EnhSwitch_18() {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch(day) {
//            case "Monday" -> System.out.println("Today is a weekday.");
//            case "Tuesday" -> System.out.println("Today is a weekday.");
//            case "Wednesday" -> System.out.println("Today is a weekday.");
//            case "Thursday" -> System.out.println("Today is a weekday.");
//            case "Friday" -> System.out.println("Today is a weekday.");
//            case "Saturday" -> System.out.println("Today is a weekend!");
//            case "Sunday" -> System.out.println("Today is a weekend!");

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println(day + " is a weekday.");
            case "Saturday", "Sunday" -> System.out.println(day + " is a weekend!");
            default -> System.out.println(day + " is not a day");
        }
        sc.close();
    }
}
