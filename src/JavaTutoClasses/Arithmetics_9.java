package JavaTutoClasses;
import java.util.Scanner;

public class Arithmetics_9 {
    public Arithmetics_9() {
//        double pi = Math.PI; // no need to create variable, just access PI inside Math
//
//        double e = Math.E; // Eulers
//        double powe = Math.pow(2, 5); // 2 to the power of 5
//        double abso = Math.abs(-67);
//        double sqr = Math.sqrt(9);
//        double rnd = Math.round(pi);
//        double ceiling = Math.ceil(3.2);
//        double flooring = Math.floor(3.7);
//        double maxim = Math.max(rnd, ceiling);
//        double minim = Math.min(rnd, ceiling);

        Scanner sc = new Scanner(System.in);
        // HYPOTENUSE
//        double a;
//        double b;
//        double c;
//
//        System.out.println("First side");
//        a = sc.nextDouble();
//        sc.nextLine();
//
//        System.out.println("Second side");
//        b = sc.nextDouble();
//        sc.nextLine();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//        System.out.println("Hypotenuse of triangle with sides " + a + " and " + b + " is " + c);
//

        // RADIUS & CIRCUMFERENCE

        double radius;
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        sc.nextLine();

        double circumference = 2 * Math.PI * radius;
        double area = (circumference* radius)/2;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        System.out.println("The area is: " + area);
        System.out.println("The circumference is: " + circumference);
        System.out.println("The volume is: " + volume);

        System.out.printf("The area is: %.2f\n", area);
        System.out.printf("The circumference is: %.2f\n", circumference);
        System.out.printf("The volume is: %.2f\n", volume);

        sc.close();
    }
}
