package JavaTutoOOP.Aggregation_53;

public class Book_53 {
    public String title;
    public int pages;

    public Book_53(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String displayInfo() {
        return this.title + " (" + this.pages + ") pages";
    }
}
