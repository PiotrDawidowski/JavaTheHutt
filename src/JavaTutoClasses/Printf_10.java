package JavaTutoClasses;

public class Printf_10 {
    public Printf_10() {
        // %[arg$][flags][width][.precision]conversion

//        String name = "Spongebob"; // lowercase s
//        char firstLetter = name.charAt(0); // lowercase c
//        int age = 30; // lowercase d (Decimal integer)
//        double height = 60.5; // lowercase f
//        boolean isEmployed = true; // lowercase b
//

        // FLAGS

//        System.out.printf("Hello, %s!\n", name);
//        System.out.printf("Your name starts with a %c\n", firstLetter);
//        System.out.printf("Your age is %d\n", age);
//        System.out.printf("Your height is %.2f\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
        // , = every 3 digits
        // . = precision, later you hive how many nums after point

        double price1 = 340.0561;
        double price2 = 10.0430;
        double price3 = -50.0040;

        double[] prices = {price1, price2, price3};

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("% ,.3f\n", prices[i]);
        }

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%,04d\n", id2);
        System.out.printf("%,04d\n", id3);
        System.out.printf("%,4d\n", id4);
    }
}
