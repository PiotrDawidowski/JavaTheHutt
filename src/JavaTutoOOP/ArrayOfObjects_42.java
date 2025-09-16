package JavaTutoOOP;

public class ArrayOfObjects_42 {
    public static class Car {
        public String model;
        public String color;

        public Car(String model, String color) {
            this.model = model;
            this.color = color;
        }

        public void drive() {
            System.out.println("You drive the " + this.color + " " + this.model);
        }
    }

    public ArrayOfObjects_42() {

    }
}
