package JavaTutoClasses;
import java.util.Scanner;
import java.util.Random;

public class Random_8 {
    public Random_8() {
        Random rand = new Random();
        for (int i = 0; i < 101; i++) {
            int x = rand.nextInt(100); // nextInt(inclusive, exclusive); if 1 is not filled and only 2 is filled then its 0, and if only one number then its the end of the range (randInt(100) 0-99.
            System.out.print(x + "\n");
        }
        for (int i = 0; i < 10; i++) {
            double x = rand.nextDouble(100); // nextInt(inclusive, exclusive); if 1 is not filled and only 2 is filled then its 0, and if only one number then its the end of the range (randInt(100) 0-99.
            System.out.print(x + "\n");
        }
    }
}
