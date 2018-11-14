import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        book1 = new Book("Alice in Wonderland", "CS Lewis", "Fantasy");
        book2 = new Book("Rumours of Rain", "Doris Lessing", "Historical Fiction");
        book3 = new Book("Mort", "Terry Pratchett", "Fantasy");
        library = new Library();
        borrower = new Borrower("Dana");

    }

    @Test
    public void canGetNumberOfBooks(){
        assertEquals(0, library.getLibrarySize());
    }

    @Test
    public void canAddToStock(){
        library.add(book1);
        assertEquals(1, library.getLibrarySize());
    }

    @Test
    public void cannotAddToStock_alreadyFull(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(3, library.getLibrarySize());
    }

    @Test
    public void canRemoveFromLibrary(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(3, library.getLibrarySize());
        library.removeFromLibrary(book1);
        assertEquals(2, library.getLibrarySize());
        assertEquals(2, library.getMaxCapacity());
    }
    @Test
    public void canLend(){
        library.add(book1);
        library.add(book2);
        library.add(book3);

        library.lend(borrower, book2);
        assertEquals(2, library.getLibrarySize());
        assertEquals(3, library.getMaxCapacity());
        assertEquals(1, borrower.getNumberOfBooks());
    }
}
