package librarymanagementsystem.Book;

import librarymanagementsystem.Newspaper.Newspaper;
import librarymanagementsystem.Newspaper.NewspaperAdapter;

public class BookBuilder{ // To Mohammed Eweda
    
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    
    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
        return this;
    }

    public BookBuilder setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public Book build(BookType genre) {
        return switch (genre) {
            case SOFTWARE_ENGINEERING -> new SoftwareEngineeringBook(title, author, publicationYear, ISBN);
            case ARTIFICIAL_INTELLIGENCE -> new ArtificialIntelligenceBook(title, author, publicationYear, ISBN);
            case MANAGEMENT -> new ManagementBook(title, author, publicationYear, ISBN);
            case NEWSPAPER -> new NewspaperAdapter(new Newspaper(title, author, publicationYear, ISBN));
            default -> throw new IllegalArgumentException("Unsupported BookType");
        };
    }

}
