package JavaTutoOOP;

public class OOP_39 {
    // NESTED CLASS
    public class Car {
        // ATTRIBUTES, ACCESS MODIFIERS
        public static String make = "Ford";
        public String model = "Focus";
        public int year = 2022;
        public double price = 34999.99;
        public boolean isRunning = false;

        // METHODS
        public void start() {
            System.out.println("You start the engine.");
            this.isRunning = true;
        }

        public void stop() {
            System.out.println("You start the engine.");
            this.isRunning = false;
        }

        public void drive() {
            System.out.println("You're driving the " + make + " " + model);
        }
    }
}


