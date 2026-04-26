package librarymanagementsystem.Book;

public enum BookType {
    SOFTWARE_ENGINEERING(0),
    MANAGEMENT(1),
    ARTIFICIAL_INTELLIGENCE(2),
    NEWSPAPER(3),
    UNKNOWN(4);
    
    private final int value;

    // Constructor to associate the number with the enum constant
    BookType(int value) {
        this.value = value;
    }

    // Getter method to retrieve the numeric value
    public int getValue() {
        return value;
    }
}
