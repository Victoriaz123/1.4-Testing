import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class LibraryTest {

    private Library library;

    @BeforeEach
     void start() {
        library = new Library();
    }

    @Test
    void listNotNullAfterObjectCreation() {
        assertNotNull(library.getBooks());
    }

    @Test
    void listIsExpectedSizeAfterAddingBooks() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    void listContainsSpecificBookInCorrectPosition() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals("Book 1", library.getBook(0));
        assertEquals("Book 2", library.getBook(1));
    }

    @Test
    void noDuplicateTitles() {
        library.addBook("Book 1");
        library.addBook("Book 1");
        assertEquals(1, library.getBooks().size());
    }

    @Test
   void retreiveBookInPosition() {
        library.addBook("Book 1");
        assertEquals("Book 1", library.getBook(0));
    }

    @Test
    void listModifiedAfterAddingBook() {
        library.addBook("Book 1");
        library.addBookInPosicion("Book 2", 1);
        assertEquals("Book 2", library.getBook(1));
    }

    @Test
    void listDecreasedAfterAddingBook() {
        library.addBook("Book 1");
        library.deleteBook("Book 1");
        assertEquals(0, library.getBooks().size());
    }

    @Test
    void listRemainsInAlphabeticalOrderIfChanged() {
        library.addBook("Book 2");
        library.addBook("Book 1");
        library.addBook("Book 3");
        List<String> books = library.getBooks();
        assertEquals("Book 1", books.get(0));
        assertEquals("Book 2", books.get(1));
        assertEquals("Book 3", books.get(2));

        library.deleteBook("Book 2");
        books = library.getBooks();
        assertEquals("Book 1", books.get(0));
        assertEquals("Book 3", books.get(1));
    }
}

