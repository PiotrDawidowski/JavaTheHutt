package JavaTutoApps;
import java.util.Scanner;

public class CompoundCalc_11 {
    public CompoundCalc_11() {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompoundedPerYear;
        int years;
        double amount;

        System.out.println("Enter principal: ");
        principal = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter interest (in %): ");
        rate = sc.nextDouble() / 100;
        sc.nextLine();
        System.out.println("Enter times compounded per year: ");
        timesCompoundedPerYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter years: ");
        years = sc.nextInt();
        sc.nextLine();

        double power =
        amount = principal * Math.pow((1 +  rate/timesCompoundedPerYear), timesCompoundedPerYear*years);

        System.out.printf("Amount of compounded per year: %.2d", amount);

        sc.close();
    }
}
