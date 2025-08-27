package JavaTutoApps;
import java.util.Scanner;

public class Calculator_19 {
    public Calculator_19() {
        Scanner sc = new Scanner(System.in);
        double firstNum;
        double secondNum;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println("Enter first number: ");
        firstNum = sc.nextDouble();
        System.out.println("Choose operator for the numbers: (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);
        System.out.println("Enter second number: ");
        secondNum = sc.nextDouble();

        switch(operator) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if(secondNum == 0) {
                    System.out.println("Cannot divide by 0");
                    validOperation = false;
                }
                else { result = firstNum / secondNum; }
            }
            case '^' -> result = Math.pow(firstNum, secondNum);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }
        if(validOperation) {
            System.out.println("" + result);
        }
        // no need for else statement, all cases handled in switch statement already

        sc.close();
    }
}
