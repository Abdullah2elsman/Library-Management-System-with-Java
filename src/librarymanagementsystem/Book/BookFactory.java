package librarymanagementsystem.Book;

import librarymanagementsystem.Newspaper.*;
public class BookFactory {

    public static Book createBook(BookType bookType,String title,String author,int publicationYear,String ISBN) {

        return switch (bookType) {
            case SOFTWARE_ENGINEERING -> new SoftwareEngineeringBook(title,author,publicationYear,ISBN);
            case MANAGEMENT -> new ManagementBook(title,author,publicationYear,ISBN);
            case ARTIFICIAL_INTELLIGENCE -> new ArtificialIntelligenceBook(title,author,publicationYear,ISBN);
            case NEWSPAPER -> new NewspaperAdapter(new Newspaper(title, author, publicationYear, ISBN));
            default -> throw new IllegalArgumentException("Invalid book category: " + bookType);
        };
    }
}
