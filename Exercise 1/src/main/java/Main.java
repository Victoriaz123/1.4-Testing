public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Head First Java");
        library.addBook("Effective Java");
        library.addBook("Java Reference Book");


        System.out.println("Books in the library: " + library.getBooks());

        library.addBookInPosicion("Java essencials", 1);
        System.out.println("After adding 'Java essencials': " + library.getBooks());

        String book = library.getBook(2);
        System.out.println("Book in position 2: " + book);

        library.deleteBook("Java essencials");
        System.out.println("After deleting 'Java essencials': " + library.getBooks());
    }
}

