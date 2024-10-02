import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

        public class Library {

            protected List<String> books;

            public Library() {
                this.books = new ArrayList<>();
            }

            public void addBook(String title) {
                if (!books.contains(title)) {
                    books.add(title);
                    Collections.sort(books);
                }
            }
            public List<String> getBooks() {
                return books;
            }
            public String getBook(int position) {
                if (position >= 0 && position < books.size()) {
                    return books.get(position);
                } else {
                    return null;
                }
            }

            public void addBookInPosicion(String title, int position) {
                if (!books.contains(title)) {
                    books.add(position, title);
                    Collections.sort(books);
                }
            }

            public void deleteBook(String title) {
                books.remove(title);
            }
        }

