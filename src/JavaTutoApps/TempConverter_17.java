package JavaTutoApps;
import java.util.Scanner;

public class TempConverter_17 {
    public TempConverter_17() {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C/F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("Converted temperature is: %.1f°%s", newTemp, unit);

        sc.close();
    }
}
