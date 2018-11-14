import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        borrower1 = new Borrower("Gillian");
        book1 = new Book("Alice in Wonderland", "CS Lewis", "Fantasy");
        book2 = new Book("Rumours of Rain", "Doris Lessing", "Historical Fiction");
        book3 = new Book("Mort", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void canGetName(){
        assertEquals("Gillian", borrower1.getName());
    }

    @Test
    public void canGetNumberOfBookBorrowed(){

        assertEquals(0, borrower1.getNumberOfBooks());
    }

    @Test
    public void canAddBookToBorrowedList(){
        borrower1.addBook(book1);
        borrower1.addBook(book2);
        assertEquals(book1.getBookTitle(), borrower1.getBooksTitle(0));
    }

    @Test
    public void cannotAddBookToBorrowedList_alreadyFull(){
        borrower1.addBook(book1);
        borrower1.addBook(book2);
        borrower1.addBook(book3);
        assertEquals(2, borrower1.getNumberOfBooks());
    }



    @Test
    public void canRemoveBookFromBorrowedList(){
        borrower1.addBook(book1);
        borrower1.addBook(book2);
        borrower1.removeBook(book1);
        assertEquals(1, borrower1.getNumberOfBooks());
        assertEquals(book2.getBookTitle(), borrower1.getBooksTitle(0));
    }
}
