import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book can exist in another library

        lib1.showBooks();
        lib2.showBooks();
    }
}
