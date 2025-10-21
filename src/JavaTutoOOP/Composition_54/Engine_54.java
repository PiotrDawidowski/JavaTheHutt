package JavaTutoOOP.Composition_54;

public class Engine_54 {
    public String type;

    Engine_54(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("You start the " + this.type);
    }
}
