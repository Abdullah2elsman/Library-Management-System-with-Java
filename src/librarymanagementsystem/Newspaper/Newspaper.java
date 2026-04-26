package librarymanagementsystem.Newspaper;

public class Newspaper implements Prototype {

    private String headline;
    private String editor;
    private int publicationDate;
    private String ISSN; // International Standard Serial Number

    public Newspaper(String headline, String editor, int publicationDate, String ISSN) {
        this.headline = headline;
        this.editor = editor;
        this.publicationDate = publicationDate;
        this.ISSN = ISSN;
    }

    // Getters
    public String getHeadline() {
        return headline;
    }

    public String getEditor() {
        return editor;  
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public String getISSN() {
        return ISSN;
    }

    // Implement the clone method
    @Override
    public Prototype clone() {
        // Create a new instance with the same values
        return new Newspaper(this.headline, this.editor, this.publicationDate, this.ISSN);
    }

    @Override
    public String toString() {
        return "Newspaper [Headline: " + headline + ", Editor: " + editor + 
               ", Publication Date: " + publicationDate + ", ISSN: " + ISSN + "]";
    }
}
