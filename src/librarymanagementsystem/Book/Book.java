package librarymanagementsystem.Book;

public interface Book {
    String getTitle();
    String getAuthor();
    int getPublicationYear();
    String getISBN();
    BookType getGenre();
    boolean isAvailable();

    default void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("ISBN: " + getISBN());
        System.out.println("BookType: " + getGenre());
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
