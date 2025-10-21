package JavaTutoOOP.Composition_54;

public class Car_54 {
    public String model;
    public int year;
    public Engine_54 engineType;

    public Car_54(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engineType = new Engine_54(engineType);
    }
}
