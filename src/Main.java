import JavaTutoApps.*;
import JavaTutoClasses.*;
import JavaTutoOOP.*;
import JavaTutoOOP.Composition_54.Car_54;
import JavaTutoOOP.RuntimePolymorphism_51.*;
import JavaTutoOOP.GetterSetter_52.*;
import JavaTutoOOP.Aggregation_53.*;

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
//        Super_45 sup45 = new Super_45();
//        Super_45.Person person1 = new Super_45.Person("Tom", "Hanks");
//        person1.showName();
//        Super_45.Student student1 = new Super_45.Student("Shinji", "Hirako", 3.7);
//        student1.showName(); student1.showGPA();
//        Super_45.Employee employee1 = new Super_45.Employee("Marcin", "Kowalski", 3899);
//        employee1.showName(); employee1.showSalary();

        // 46
//        MethodOverride_46 meov46 = new MethodOverride_46();
//        MethodOverride_46.Cat cat = new MethodOverride_46.Cat();
//        cat.move();
//        MethodOverride_46.Fish fish = new MethodOverride_46.Fish();
//        fish.move();

        // 47
//        toString_47 tostr47 = new toString_47();
//        toString_47.Car car = new toString_47.Car("Ford", "Mustang", 2025, "red");
//        System.out.println(car);

        // 48
//        Abstraction_48 abs48 = new Abstraction_48();
//      CANNOT INSTANTIATE ABSTRACT CLASS
//        Abstraction_48.Shape shape = new Abstraction_48.Shape();
//        Abstraction_48.Circle circle = new Abstraction_48.Circle(5);
//        Abstraction_48.Triangle triangle = new Abstraction_48.Triangle(4, 7);
//        Abstraction_48.Rectangle rectangle = new Abstraction_48.Rectangle(6, 3);
//
//        System.out.println(circle.area());
//        System.out.println(triangle.area());
//        System.out.println(rectangle.area());

        // 49
//        Interfaces_49 int49 = new Interfaces_49();
//        Interfaces_49.Rabbit rabbit = new Interfaces_49.Rabbit();
//        rabbit.flee();
//        Interfaces_49.Fish fish = new Interfaces_49.Fish();
//        fish.flee();
//        fish.hunt();
//        Interfaces_49.Hawk hawk = new Interfaces_49.Hawk();
//        hawk.hunt();

        // 50
//        Polymorphism_50 pol50 = new Polymorphism_50();
//        Polymorphism_50.Vehicle car = new Polymorphism_50.Car();
//        Polymorphism_50.Bike bike = new Polymorphism_50.Bike();
//        Polymorphism_50.Boat boat = new Polymorphism_50.Boat();
//
//
//        Polymorphism_50.Vehicle[] vehicles = {car, bike, boat};
//
//        for(Polymorphism_50.Vehicle vehicle : vehicles) {
//            vehicle.go();
//        }

        // 51 - basically you declare reference variable "animal" that doesnt point to anything yet
//        Scanner sc = new Scanner(System.in);
//        Animal_51 animal;
//        System.out.println("Would you like a dog or a cat? \n1. dog \n2. cat");
//
//        if (sc.nextInt() == 1) {
//            animal = new Dog_51();
//            animal.speak();
//        }
//
//        else if (sc.nextInt() == 2) {
//            animal = new Cat_51();
//            animal.speak();
//        }

        // 52
//        Car_52 car = new Car_52("Charger", "Yellow", 10000);
//        System.out.println(car); // with toString overridden
//        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
//        car.setColor("Blue");
//        car.setPrice(8999);
//        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        // 53
//        Book_53 book1 = new Book_53("The Fellow of the Ring", 423);
//        Book_53 book2 = new Book_53("The Two Towers", 352);
//        Book_53 book3 = new Book_53("The Return of the King", 416);
//
//        Book_53[] books = {book1, book2, book3};
//        for (Book_53 book : books) {
//            System.out.println(book.displayInfo());
//        }
//
//        Library_53 library = new Library_53("NYC Public Library", 1897, books);
//        library.displayInfo();
        // 54

//        Car_54 car = new Car_54("Toyota", 2001, "V-type");
//        System.out.println(car.engineType.type); // engineType is an object, you need to access its type directly
//
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.engineType.type);
//
//        car.engineType.start();

        // 55
        // DEPRECATED
//        Integer a = new Integer(123);
//        Double b = new Double(4.3);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);

        // Autoboxing
        int x = 123;
        Integer a = x;
        Double b = 4.3;
        Character c = '$';
        Boolean d = true;
        Integer e = Integer.valueOf(456);

        // Unboxing
        double b2 = b;

        // toString
        String f = Integer.toString(2);
        String g = Character.toString('$');
        String h = Double.toString(2.3);
        String i = Boolean.toString(true);

        // parsing, printing that gives compilation errir
        int j = Integer.parseInt(f);
        double k = Double.parseDouble("3.14");
        char l = i.charAt(1);
        boolean m = Boolean.parseBoolean("true");

        char letter = 's';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));



    }
}














