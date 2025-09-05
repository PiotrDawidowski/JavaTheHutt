package JavaTutoClasses;
import java.util.Scanner;

public class NestedLoops_25 {
    public NestedLoops_25() {

//        for (int i = 1; i <= 9; i++) {
//            System.out.println(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(i + " ");
//        } Jesus its horrendous

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <= 9; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        } that's better

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int rows = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter number of columns: ");
        int columns = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter symbol for the figure: ");
        char symbol = sc.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
