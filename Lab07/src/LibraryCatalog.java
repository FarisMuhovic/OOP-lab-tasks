import java.util.*;

public class LibraryCatalog {
    List<Book> shelf = new ArrayList<>();
    public LibraryCatalog(List<Book> shelf ) {
        this.shelf = shelf;
    }
    public Optional<Book> checkAvailabilityByTitle(String title) {
        return shelf.stream().filter(book -> book.title()
                .equals(title)).findFirst().filter(book -> book.status());
    }
    public Optional<Book> retrieveDetails(String author) {
        return shelf.stream().filter(book -> book.author()
                .equals(author)).findFirst().filter(book-> book.status());
    }
    public void updateAvailability(String title,Boolean status) {
        this.shelf.stream().filter(book-> book.title().equals(title))
                .findFirst()
                .ifPresent(book-> book= new Book(book.title(),book.author(),book.publication_year(), status));
    }
}
