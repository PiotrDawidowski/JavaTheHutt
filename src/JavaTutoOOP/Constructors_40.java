package JavaTutoOOP;

public class Constructors_40 {
    // used to initialize objects
    public class Student {
        public String name;
        public int age;
        public double gpa;
        public boolean isEnrolled;

        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.isEnrolled = true;
        }

        public void Study() throws InterruptedException {
            System.out.println(this.name + " is studying now...");
            Thread.sleep(500);
            Study();
        }
    }
}
