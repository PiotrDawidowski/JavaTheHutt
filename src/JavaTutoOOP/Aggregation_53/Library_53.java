package JavaTutoOOP.Aggregation_53;

public class Library_53 {
    String name;
    int year;
    Book_53[] books;

    public Library_53(String name, int year, Book_53[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void displayInfo() {
        System.out.println(this.name + " was established in year" + this.year + " and has " + this.books.length + " books");
        for (Book_53 book : books) {
            // you call String method from book, which returns string so you can print it
            System.out.println(book.displayInfo());
        }
    }
}