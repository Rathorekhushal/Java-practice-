package Smallproject;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String ISbN;
    private String Tittle;
    private String Author;
    private boolean Avialable;
    public Book(String ISbN, String Tittle,String Author,boolean Avialable){
        this.ISbN=ISbN;
        this.Tittle=Tittle;
        this.Author=Author;
        this.Avialable=Avialable;


    }
    public String getISbN(){
        return ISbN;
    }
    public String getTittle(){
        return Tittle;

    }
    public String getAuthor(){
        return Author;
    }
    public  boolean isAvailable(){
        return Avialable;
    }
    public void setAvailable(boolean Available){
        this.Avialable=Avialable;
    }
    public void CheckOut(){
        if(Avialable==false){
            System.out.println("Book checked out"+Tittle);
        }else{
            System.out.println("Book not available "+Tittle);
        }
    }
    public void CheckIn(){
        if(Avialable==true){
            System.out.println("Book checked in"+Tittle);
        }
    }
    // Properties: User ID, name, contact information, books borrowed, etc.
    // Methods: Getters and setters, methods to display user information.
}
class User{
    private int UserID;
    private String Name;
    private String ContactINFO;
    private List<Book> borrowedBooks;
    public User(int UserID, String Name, String ContactINFO){
        this.UserID=UserID;
        this.ContactINFO=ContactINFO;
        this.Name=Name;
        this.borrowedBooks=new ArrayList<>();
    }
   public String getName(){
    return Name;
   }
    public int getUserID(){
        return UserID;
    }
    public String getContactINFO(){
        return ContactINFO;
    }
    public void borrowedBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.CheckOut();
            System.out.println(Name + " borrowed: " + book.getTittle());
        } else {
            System.out.println("Book not available for borrowing: " + book.getTittle());
        }
    }
    public void returnBooks(Book book){
        if(borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.CheckIn();
            System.out.println("rutined "+book.getTittle());
        }
        else{
            System.out.println("Did not borrow"+book.getTittle());
        }

    }
}
class Library{
    private List<Book> books;
    private List<User> users;
    // private List<Transaction> transactions;
    public Library(){
        this.books=new ArrayList<>();
        this.users=new ArrayList<>();
    }
}
 class Transaction {
    private int transactionId;
    private int bookId;
    private int userId;
    public Transaction(int transactionId,int bookId,int userId){
        this.bookId=bookId;
        this.transactionId=transactionId;
        this.userId=userId;
    }
    public int getbookId(){
        return bookId;

    }
    public int getUserId(){
        return userId;
    }
    public int gettransctionId(){
        return transactionId;
    }


public class LibraryManagment{
    Book book1 =new Book("322", "java programming", "jhon", true);
    Book book2 = new Book("456", "Object-Oriented-Design", "Jane-Smith",true);
    User user1 = new User(1, "khushal", "alice@example.com");
    User user2 = new User(2, "rathore", "bob@example.com");
}
}