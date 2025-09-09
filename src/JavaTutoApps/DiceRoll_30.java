package JavaTutoApps;
import java.util.Scanner;
import java.util.Random;

public class DiceRoll_30 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static int sumOfAllRolls = 0;
    static int numOfRolls = 0;
    static int totalRolls = 0;
    public DiceRoll_30() {
        takeInNumberOfRolls();
        for (int i = 1; i <= numOfRolls; i++) {
            int currRoll = rand.nextInt(1, 7);
            chooseDiceGraphic(currRoll);
            System.out.printf("You've rolled %d. This was %dth roll. Your current score is %d%n\n", currRoll, i, sumOfAllRolls);
        }
    }

    public void chooseDiceGraphic(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
        totalRolls++;
        sumOfAllRolls = sumOfAllRolls + roll;
    }

    public void takeInNumberOfRolls() {
        System.out.println("How many dices do you want to throw?: ");
        numOfRolls = sc.nextInt();
        if (numOfRolls <= 0) {
            System.out.println("# of rolls must be greater than 0 and must be an integer.");
            takeInNumberOfRolls();
        }
    }
}
