package JavaTutoClasses;
import java.util.Scanner;

public class ForLoops_23 {
    public ForLoops_23() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
//        System.out.println("From what number to countdown? (at least 1): ");
//        int number = sc.nextInt();
//        sc.nextLine();
//        System.out.println("how many miliseconds between each number (at least 10?");
//        int miliseconds = sc.nextInt();
//        sc.nextLine();
//
//        while (number < 1){
//            if (number < 1 || miliseconds < 10) {
//                System.out.println("From what number to countdown? (at least 1): ");
//                number = sc.nextInt();
//                sc.nextLine();
//                System.out.println("how many miliseconds between each number (at least 10?");
//                miliseconds = sc.nextInt();
//                sc.nextLine();
//            } else {
//                for (int i = number; i >= 0; i--) {
//                    System.out.println(number);
//                    Thread.sleep(miliseconds);
//                }
//            }
//        }

        System.out.print("How many seconds to countdown from?: ");
        int start = sc.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");
    }
}
