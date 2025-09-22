package JavaTutoOOP;

public class toString_47 {
    public static class Car {
        public String make;
        public String model;
        public int year;
        public String color;

        public Car(String make, String model, int year, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        // cool beans
        @Override
        public String toString() {
            return this.color + " " + this.year + " " +this.make + " " +this.model;
        }
    }
}
