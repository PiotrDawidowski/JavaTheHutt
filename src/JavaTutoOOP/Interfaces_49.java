package JavaTutoOOP;

public class Interfaces_49 {
    public static class Rabbit implements Prey_49 {
        @Override
        public void flee() {
            System.out.println("The rabbit is running away...");
        }
    }

    public static class Fish implements Prey_49, Predator_49 {
        @Override
        public void flee() {
            System.out.println("The fish is swimming away...");
        }

        @Override
        public void hunt() {
            System.out.println("The fish is hunting...");
        }
    }

    public static class Hawk implements Predator_49 {
        @Override
        public void hunt() {
            System.out.println("The hawk is hunting...");
        }
    }
}
