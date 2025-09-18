package JavaTutoOOP;

public class Inheritance_44 {
    public static class Animal extends Organism{
        String name;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("The animal is eating.");
        }
    }

    public static class Organism {
        boolean isAlive;

        public Organism() {
            this.isAlive = true;
        }

    }

    public static class Dog extends Animal {
        int lives = 1;
        public void eat() {
            System.out.println("The dog is eating.");
        }

        public void bark() {
            System.out.println("BARK");
        }
    }

    public static class Cat extends Animal {
        public int lives = 9;
        public void eat() {
            System.out.println("The dog is eating.");
        }

        public void meow() {
            System.out.println("MEOW");
        }
    }

    public static class Plant extends Organism{
        public void photosynthesize() {
            System.out.println("The plant is 'breathing'");
        }
    }
}
