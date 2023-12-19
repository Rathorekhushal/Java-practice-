import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // public String toString() {
    //     return "Book{" +
    //             "isbn='" + isbn + '\'' +
    //             ", title='" + title + '\'' +
    //             ", author='" + author + '\'' +
    //             ", available=" + available +
    //             '}';
    // }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}

class User {
    private int userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Library library, String isbn) {
        for (Book book : library.getBooks()) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                borrowedBooks.add(book);
                System.out.println(name + " has borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not available for borrowing.");
    }

    public void returnBook(Library library, String isbn) {
        for (Book book : borrowedBooks) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                borrowedBooks.remove(book);
                System.out.println(name + " has returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the list of borrowed books.");
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
        System.out.println();
    }
}

public class Library {
    public static void main(String[] args) {
        // Instantiate Library and User objects
        Library library = new Library("MyLibrary");
        User user = new User(1, "khushal");

        // Add some books to the library
        library.addBook(new Book("123456789", "Java Programming", "jhon smith", true));
        library.addBook(new Book("987654321", "Python Basics", "Jane Doe", true));

        // Display available books in the library
        library.displayBooks();

        // Allow user to borrow a book
        user.borrowBook(library, "123456789");

        // Display user's borrowed books
        user.displayBorrowedBooks();

        // Allow user to return a book
        user.returnBook(library, "123456789");

        // Display available books in the library after returning the book
        library.displayBooks();
    }
}
// one error in main method 