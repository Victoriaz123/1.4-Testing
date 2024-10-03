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
                    return "Error! Cannot find the book";
                }
            }

            public void addBookInPosicion(String title, int position) {
                if (!books.contains(title)) {
                    books.add(position, title);
                    Collections.sort(books);
                }
            }

            public String deleteBook(String title) {
                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).equalsIgnoreCase(title)) {
                        books.remove(i);
                        return "The book '" + title + "' was deleted.";
                    }
                }
                return "Could not find the book '" + title + "'.";
            }
        }
