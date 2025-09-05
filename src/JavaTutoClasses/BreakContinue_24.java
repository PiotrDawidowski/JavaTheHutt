package JavaTutoClasses;

public class BreakContinue_24 {
    public BreakContinue_24() {
        for(int i = 0; i <= 10; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
