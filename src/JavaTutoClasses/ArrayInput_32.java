package JavaTutoClasses;
import java.util.Scanner;

public class ArrayInput_32 {
    public ArrayInput_32() {
        Scanner sc = new Scanner(System.in);
//        String[] foods = new String[3];

//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "hamburger";

        String[] foods;
        System.out.println("# of foods that you want to input: ");
        foods = new String[sc.nextInt()];

        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Please input the name of food no. %d:%n", i+1);
            foods[i] = sc.nextLine();
        }

        for(String food : foods) {
            System.out.print(food + ", ");
        }

        sc.close();
    }
}
