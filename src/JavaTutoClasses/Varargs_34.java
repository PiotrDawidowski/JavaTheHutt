package JavaTutoClasses;

public class Varargs_34 {
    static int[] numsI = {1, 2, 3, 4, 5};
    static double[] numsD = {1.32, 2.546, 3.13422, 4.2413, 5.132};
    public Varargs_34() {
        System.out.println(add(numsI));
        System.out.println(average(numsD));
    }

//    public double add(int a, int b) {
//        return a+b;
//    }
//    public double add(int a, int b, int c) {
//        return a+b+c;
//    }
//    public double add(int a, int b, int c, int d) {
//        return a+b+c+d;
//    }

    static int add(int... numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;
        int count = numbers.length;

        if (count == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum/count;
    }
}