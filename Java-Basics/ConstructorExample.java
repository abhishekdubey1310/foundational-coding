class Book {
    String title;
    int pages;

    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void show() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 300);
        b1.show();
    }
}