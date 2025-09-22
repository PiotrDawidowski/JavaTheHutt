import JavaTutoApps.*;
import JavaTutoClasses.*;
import JavaTutoOOP.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 2
//        Variables_2 obj2 = new Variables_2();
//        obj2.Info();

        // 3
//        new Scanner_3(); // works with constructor
//        Scanner_3 obj3 = new Scanner_3(); // if you dont have a constructor
//        obj3.problemWithN(); // gosh darn input buffer

        // 4
//        new MadLibs_4();

        // 6
//        new ShoppingCart_6();

        // 7
//        new If_7();

        // 8
//        new Random_8();

        // 9
//        new Arithmetics_9();

        // 10
//        new Printf_10();

        // 11
//        new CompoundCalc_11();

        // 12
//        new NestedIf_12();

        // 13
//        new Strings_13();

        // 14
//        new Substring_14();

        // 15
//        new WeightConverter_15();

        // 16
//        new Ternary_16();

        // 17
//        new TempConverter_17();

        // 18
//        new EnhSwitch_18();

        // 19
//        new Calculator_19();

        // 20
//        new LogicalOps_20();

        // 21
//        new While_21();

        // 22
//        new NumberGuesser_22();

        // 23
//        new ForLoops_23();

        // 24
//        new BreakContinue_24();

        // 25
//        new NestedLoops_25();

        // 26
//        new Methods_26();

        // 27
//        new Overloading_27();

        // 28
//        new VariableScope_28();

        // 29
//        new BankingApp_29();

        // 30
//        new DiceRoll_30();

        // 31
//        new Arrays_31();

        // 32
//        new ArrayInput_32();

        // 33
//        new SearchArray_33();

        // 34
//        new Varargs_34();

        // 35
//        new TwoDimArrays_35();

        // 36
//        new Quiz_36();

        // 37
//        new RockPaperScissors_37();

        // 38
//        new SlotsMachine_38();

        // 39
//        OOP_39 oop39 = new OOP_39();
//        OOP_39.Car car = oop39.new Car();
//        System.out.println(car); // memory address since object is on heap (reference type)
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);
//
//        car.isRunning = true;
//        System.out.println(car.isRunning);
//
//        car.start();
//        System.out.println(car.isRunning);
//        car.stop();
//        System.out.println(car.isRunning);

        // 40
//        Constructors_40 con40 = new Constructors_40();
//        Constructors_40.Student student1 = con40.new Student("Spongebob", 23, 3.2);
//        Constructors_40.Student student2 = con40.new Student("Patrick", 32, 2.1);
//        Constructors_40.Student student3 = con40.new Student("Sandy", 29, 4.0);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//        System.out.println(student1.isEnrolled);
//        student1.Study();

        // 41
//        OverloadedConstructors_41 oc41 = new OverloadedConstructors_41();
//        OverloadedConstructors_41.User user1 = oc41.new User("Spongebob");
//        OverloadedConstructors_41.User user2 = oc41.new User("Patrick", "patr1ck@mail.com");
//        OverloadedConstructors_41.User user3 = oc41.new User("Sandy", "s4ndy@mail.com", 28);
//        OverloadedConstructors_41.User user4 = oc41.new User();
//
//        System.out.println(user4.username);
//        System.out.println(user4.email);
//        System.out.println(user4.age);

        // 42
//        ArrayOfObjects_42 aoo42 = new ArrayOfObjects_42();
//        ArrayOfObjects_42.Car car1 = new ArrayOfObjects_42.Car("Focus", "Blue");
//        ArrayOfObjects_42.Car car2 = new ArrayOfObjects_42.Car("Jazz", "Teal");
//        ArrayOfObjects_42.Car car3 = new ArrayOfObjects_42.Car("Ibiza", "Yellow");
//
//        ArrayOfObjects_42.Car[] cars = {car1, car2, car3};
//
//        for (int i = 0; i < cars.length; i++) {
//            cars[i].drive();
//        }
//
//        for (ArrayOfObjects_42.Car car : cars) {
//            car.drive();
//        }
//
//        for (ArrayOfObjects_42.Car car : cars) {
//            car.color = "Black";
//        }
//
//        for (ArrayOfObjects_42.Car car : cars) {
//            car.drive();
//        }

        // 43
//        Static_43 st43= new Static_43();
//        Static_43.Friend friend1 = new Static_43.Friend("Smough");
//        Static_43.Friend friend2 = new Static_43.Friend("Ornnstein");
//        Static_43.Friend friend3 = new Static_43.Friend("Bayle");
//        Static_43.Friend friend4 = new Static_43.Friend("Gaping Dragon");
//
//        System.out.println(Static_43.Friend.numOfFriends);
//        Static_43.Friend.showFriends();

        // 44
//        Inheritance_44 inh44 = new Inheritance_44();
//        Inheritance_44.Dog dog = new Inheritance_44.Dog();
//        Inheritance_44.Cat cat = new Inheritance_44.Cat();
//        Inheritance_44.Plant plant = new Inheritance_44.Plant();
//
//        plant.photosynthesize();

        // 45
        Super_45 sup45 = new Super_45();
        Super_45.Person person1 = new Super_45.Person("Tom", "Hanks");
        person1.showName();
        Super_45.Student student1 = new Super_45.Student("Shinji", "Hirako", 3.7);
        student1.showName(); student1.showGPA();
        Super_45.Employee employee1 = new Super_45.Employee("Marcin", "Kowalski", 3899);
        employee1.showName(); employee1.showSalary();

    }
}














