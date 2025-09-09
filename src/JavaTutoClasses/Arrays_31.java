package JavaTutoClasses;
import java.util.Arrays;

public class Arrays_31 {
    static String[] fruits = {"apple", "orange", "banana", "coconut"};
    static int numOfFruits = fruits.length;
    public Arrays_31() {
        printFruits();
        fruits[3] = "pineapple";
        enhPrintFruits();
        sortFruits();
        fillFruits();
    }

    public void printFruits() {
        for (int i = 0; i < numOfFruits; i++) {
            System.out.print(fruits[i] + ", ");
        }
        System.out.print("\n");
    }

    // forEach loop
    public void enhPrintFruits() {
        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
    }

    public void updateNumOfFruits(int x) {
        numOfFruits = x;
    }

    // SORT AN ARRAY USING java.util.Arrays;
    public void sortFruits() {
        Arrays.sort(fruits);
    }

    // FILL AN ARRAY USING THE SAME
    void fillFruits() {
        Arrays.fill(fruits, "pineapple");
    }
}