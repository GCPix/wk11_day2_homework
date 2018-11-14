import java.util.ArrayList;

public class Book {


//    Books should have title, author and genre.
//    Write a method to count the number of books in the library.
//    Write a method to addBook a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


    public String getBookTitle() {
        return this.title;
    }

    public String getBookAuthor() {
        return this.author;
    }

    public String getBookGenre(){
        return this.genre;
    }
}
