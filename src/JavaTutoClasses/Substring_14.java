package JavaTutoClasses;
import java.util.Scanner;

public class Substring_14 {
    public Substring_14() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide your email: ");

        String email = sc.nextLine();
//        String username = email.substring(0, email.indexOf("@")); // 2nd index is exclusive
//        String domain = email.substring(email.indexOf("@") + 1); // same as (9, 18) no need for second index if we will take everything till the end of the string

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username + ", " + domain);
        }
        else {
            System.out.println("Your email is incorrect.");
        }

//        System.out.println(username + ", " + domain);
        sc.close();
    }
}