package JavaTutoClasses;

public class Overloading_27 {
    public String pizza;

    public Overloading_27() {
        System.out.println(add(1, 2, 3, 4) + ": add method");
        System.out.println(add(1, 2, 3) + ": also an add method");
        System.out.println(add(1, 2) + ": and also an add method");

        String pizza1 = bakePizza("flat bread", "mozzarella");
        String pizza2 = bakePizza("flat bread", "mozzarella", "olives");
        String pizza3 = bakePizza("flat bread");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }

    public double add(double x1, double x2) {
        return x1+x2;
    }

    public double add(double x1, double x2, double x3) {
        return x1+x2+x3;
    }

    public double add(double x1, double x2, double x3, double x4) {
        return x1+x2+x3+x4;
    }

    public String bakePizza(String bread) {
        return bread + " pizza";
    }

    public String bakePizza(String bread, String cheese) {
        return bread + " " + cheese + " pizza";
    }

    public String bakePizza(String bread, String cheese, String topping) {
        return bread + " " + cheese + " " + topping + " pizza";
    }
}
