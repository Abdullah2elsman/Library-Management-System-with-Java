package librarymanagementsystem.Book;

public class ArtificialIntelligenceBook implements Book {

    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    private boolean  isAvailable;



    public ArtificialIntelligenceBook(String title, String author, int publicationYear, String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    @Override
    public BookType getGenre() {
        return BookType.ARTIFICIAL_INTELLIGENCE;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void displayDetails() {
        Book.super.displayDetails();
    }
}
