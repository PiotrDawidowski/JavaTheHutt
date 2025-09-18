package JavaTutoOOP;

public class Static_43 {
    public static class Friend {
        // STATIC MAKES A VARIABLE/METHOD BELONG TO CLASS RATHER TO OBJECT ALONE
        public static int numOfFriends;
        public String name;

        public Friend(String name) {
            this.name = name;
            numOfFriends++;
        }

        public static void showFriends() {
            System.out.println("You have " + numOfFriends + " total friends.");
        }
    }
}
