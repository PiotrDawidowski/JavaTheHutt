package JavaTutoOOP;

public class Polymorphism_50 {
    public abstract static class Vehicle {
        public abstract void go();
    }

    public static class Car extends Vehicle {
        @Override
        public void go() {
            System.out.println("You drive the car");
        }
    }

//    public static class Car implements Vehicle_50 { // interface instead of class
//        @Override
//        public void go() {
//            System.out.println("You drive the car");
//        }
//    }

    public static class Bike extends Vehicle {
        @Override
        public void go() {
            System.out.println("You ride the bike");
        }
    }

    public static class Boat extends Vehicle {
        @Override
        public void go() {
            System.out.println("You sail the boat");
        }
    }
}
