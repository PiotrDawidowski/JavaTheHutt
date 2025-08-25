package JavaTutoClasses;

public class Ternary_16 {
    public Ternary_16() {
        int score = 70;
        int number = 57;

//        if (score >= 50) {
//            System.out.println("PASS");
//        }
//        else {
//            System.out.println("FAIL");
//        }

        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        String evenOrOdd = (number % 2 == 0) ? "number is even" : "number is odd";
        System.out.println(evenOrOdd);

    }
}
