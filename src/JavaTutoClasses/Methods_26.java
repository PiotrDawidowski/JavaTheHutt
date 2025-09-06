package JavaTutoClasses;

public class Methods_26 {
    static int age = 25;
    static String name = "Peter";
    static double number = 4;
    static String fn = "Piotr";
    static String ln = "Dawidowski";

    public Methods_26() {
        wishHappyBirthday();
        System.out.println(square(number));
        System.out.println(cube(number));
        System.out.println(getFullName(fn, ln));
        System.out.println(isAdult(age));
    }

    //The constructor runs after fields are initialized, but before the object is fully “ready” for outside use. So any method you call should not rely on things that aren’t yet initialized (e.g., derived class fields in inheritance scenarios).
    static void wishHappyBirthday() {
        System.out.println("Happy birthday to you!\n");
        System.out.printf("Happy birthday dear %s!", name);
        System.out.printf("You are %d years old!", age);
        System.out.println("Happy birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }
    double cube(double number) {
        return number * number * number;
    }
    String getFullName(String first, String last) {
        return first + " " + last;
    }
    static String isAdult(int age) {
        return (age >= 18) ? "you're an adult." : "you're NOT an adult." ;
    }
}
