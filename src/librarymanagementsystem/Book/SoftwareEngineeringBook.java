package librarymanagementsystem.Book;

public class SoftwareEngineeringBook implements Book{

    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    private boolean isAvailable;

    public SoftwareEngineeringBook(String title, String author, int publicationYear, String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        isAvailable = true;
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


    public void setAvailable(boolean available) {
        isAvailable = available;
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
        return BookType.SOFTWARE_ENGINEERING;
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
