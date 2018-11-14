import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

//    Books should have title, author and genre.
//    Write a method to count the number of books in the library.
//    Write a method to addBook a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("Alice in Wonderland", "CS Lewis", "Fantasy");
        book2 = new Book("Rumours of Rain", "Doris Lessing", "Historical Fiction");
        book3 = new Book("Mort", "Terry Pratchett", "Fantasy");

    }

    @Test
    public void canGetBookTitle(){
        assertEquals("Alice in Wonderland", book1.getBookTitle());
    }
    @Test
    public void canGetBookAuthor(){
        assertEquals("CS Lewis", book1.getBookAuthor());
    }
    @Test
    public void canGetBookGenre(){
        assertEquals("Fantasy", book1.getBookGenre());
    }
}
