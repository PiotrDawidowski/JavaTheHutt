package JavaTutoOOP;

public class Super_45 {
    public static class Person {
        public String first;
        public String last;

        public Person() {
        }

        public Person(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public void showName() {
            System.out.println(first + " " + last);
        }
    }

    // every field parent constructor requires, we need to pass it to it
    public static class Student extends Person {
        public double gpa;

        public Student(String first, String last, double gpa) {
            super(first, last);
            this.gpa = gpa;
        }

        public void showGPA() {
            System.out.println("GPA: " + this.gpa);
        }
    }

    public static class Employee extends Person {
        public int salary;
        public Employee(String first, String last, int salary) {
            super(first, last);
            this.salary = salary;
        }

        public void showSalary() {
            System.out.println("Salary: " + this.salary);
        }
    }
}
