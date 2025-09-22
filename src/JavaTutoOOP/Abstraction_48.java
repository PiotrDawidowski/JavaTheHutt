package JavaTutoOOP;

// hiding implementation details and only showing essential features
public class Abstraction_48 {
    public static abstract class Shape {
        public abstract double area(); // ABSTRACT METHOD FORCES CHILDREN CLASSES TO IMPLEMENT IT
        public void display() { // CONCRETE IS INHERITED
            System.out.println("This is a shape");
        }
    }

    public static class Triangle extends Shape {
        public double height;
        public double base;

        public Triangle(double height, double base) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return this.base*this.height/2;
        }
    }

    public static class Rectangle extends Shape {
        public double side1;
        public double side2;

        public Rectangle(double side1, double side2) {
            this.side1 = side1;
            this.side2 = side2;
        }

        @Override
        public double area() {
            return this.side1*this.side2;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }
}
