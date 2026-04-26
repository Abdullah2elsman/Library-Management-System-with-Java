package librarymanagementsystem.Newspaper;

import librarymanagementsystem.Book.*;

public class NewspaperAdapter implements Book {
    private final Newspaper newspaper;

    public NewspaperAdapter(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public String getTitle() {
        return newspaper.getHeadline();
    }

    @Override
    public String getAuthor() {
        return newspaper.getEditor(); // Using editor as the "author"
    }

    @Override
    public int getPublicationYear() {
        return newspaper.getPublicationDate();
    }

    @Override
    public String getISBN() {
        return newspaper.getISSN(); // Using ISSN as ISBN for compatibility
    }

    @Override
    public BookType getGenre() {
        return BookType.NEWSPAPER; // Default genre for newspapers
    }

    @Override
    public boolean isAvailable() {
        return true; // Assume newspapers are always available
    }

    @Override
    public void displayDetails() {
        System.out.println("Adapted Newspaper:");
        Book.super.displayDetails();
    }
}

