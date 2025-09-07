package JavaTutoClasses;

public class VariableScope_28 {
    int num = 3; // belongs to the CLASS, can be used by any method inside the class.
    public VariableScope_28() {
        int num = 67; // I can define num here because num inside method is local to the curly braces
        System.out.println(num); // num used here is the one from up above, not the one from the method
    }

    // num is a variable local to this method
    public int returnNum() {
        int num = 1;
        return num;
    }

}
