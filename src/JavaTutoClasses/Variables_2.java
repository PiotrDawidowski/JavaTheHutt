package JavaTutoClasses;

public class Variables_2 {
    int age = 22;
    int year = 2025;
    public void PrintYear() {
        System.out.println("The year is: " + year);
    }

    double price = 19.99;
    double GPA = 4.33;

    char grade = 'A';
    char dollar = '$';

    boolean isStudent = true;
    boolean isHot = false;

    public void IsStudent(){
        if(isStudent) {
            System.out.println("Student is a student");
        }
        else {
            System.out.println("Student is not a student");
        }
    }

    String name = "Peter";
    String car = "Prius";
    String color = "gray";
    String mail = "w62137@prz.edu.pl";

    public void Info() {
        System.out.println("Hello, " + name + "! Is your " + car + "'s color "+ color + "?");
    }
}