package JavaTutoOOP;

public class MethodOverride_46 {
    public static class Animal {
        public void move() {
            System.out.println("Running...");
        }
    }

    public static class Cat extends Animal {
        // cat can run so its fine to use supermethod
    }

    public static class Fish extends Animal{
        @Override
        public void move() {
            System.out.println("Swimming...");
        }
    }

}
