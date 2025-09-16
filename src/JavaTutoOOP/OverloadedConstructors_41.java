package JavaTutoOOP;

public class OverloadedConstructors_41 {
    public class User {
        public String username;
        public String email;
        public int age;

        public User() {
            this.username = "Guest";
            this.email = "Not provided";
            this.age = 0;
        }

        public User(String username) {
            this.username = username;
            this.email = "Not provided";
            this.age = 0;
        }

        public User(String username, String email) {
            this.username = username;
            this.email = email;
            this.age = 0;
        }

        public User(String username, String email, int age) {
            this.username = username;
            this.email = email;
            this.age = age;
        }
    }

}
