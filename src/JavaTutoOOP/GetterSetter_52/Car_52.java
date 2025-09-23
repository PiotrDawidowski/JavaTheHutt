package JavaTutoOOP.GetterSetter_52;

public class Car_52 { // WE DON'T MAKE SETTER FOR MODEL BECAUSE WE CAN'T CHANGE IT IN REAL LIFE, BUT WE CAN REPAINT IT WOOOW
    private String model;
    private String color;
    private double price;

    public Car_52(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public String getPrice() {
        return "$"+this.price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price can't be lesser than zero");
        }
        else {this.price = price;}
    }


//    @Override // allows to print private fields
//    public String toString() {
//        return this.model + " " + this.model + ", cost: " + this.price;
//    }
}
