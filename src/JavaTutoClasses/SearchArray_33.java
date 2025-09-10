package JavaTutoClasses;

import java.util.Scanner;

public class SearchArray_33 {
    static Scanner sc = new Scanner(System.in);
    int[] numbers = {1, 6, 4, 3, 6, 8, 2, 5, 8, 4, 2, 7, 6, 5, 4, 3 ,2 ,1, 9, 0};
    String[] fruits = {"Banana", "Apple", "Mango", "Pear", "Banana", "Apple", "Mango", "Mango", "Pear", "Banana"};

    public SearchArray_33() {
        findTarget(numbers);
        sc.nextLine();
        findTarget(fruits);
    }

    public void findTarget(int[] nums) {
        System.out.println("What number to search: ");
        int target = sc.nextInt();
        int occurences = 1;
        boolean isFound = false;
        System.out.printf("Searching for %d in numbers...%n", target);
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                System.out.printf("Target (%d) found at index %d, this is its occurence no. %d%n", target, i, occurences);
                occurences++;
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.printf("No matches found for target '%d'", target);
        }
    }

    public void findTarget(String[] fruts) {
        boolean isFound = false;
        int occurences = 1;

        System.out.println("What fruit to search: ");
        String target = sc.nextLine();
        System.out.printf("Searching for %s in fruits...%n", target);
        for (int i = 0; i < fruts.length; i++) {
            if(fruts[i].equals(target)) {
                System.out.printf("Target (%s) found at index %d, this is its occurence no. %d%n", target, i, occurences);
                occurences++;
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.printf("No matches found for target '%s'", target);
        }
    }
}
