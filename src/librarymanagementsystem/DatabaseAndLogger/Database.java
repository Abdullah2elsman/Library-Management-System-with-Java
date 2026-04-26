package librarymanagementsystem.DatabaseAndLogger;

import static java.lang.String.valueOf;
import librarymanagementsystem.Book.*;
import librarymanagementsystem.Users.*;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import librarymanagementsystem.HomeAdmin;
import librarymanagementsystem.HomeUser;

public class Database {
    private static Database instance = new Database();
    private Connection connection;

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    private Database() {
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Database connection established!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // Public method to get the instance of Database (Singleton)
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }

        return instance;
    }

    // Method to get the connection
    public Connection getConnection(){
        return connection;
    }

    public void closeConnection(){
        try{
            if(connection != null) {
                connection.close();
                System.out.println("Database Connection Closed");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // -------------------------------- Books Management --------------------------------------

    // Add Book Data
    public boolean addBook(Book book) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance

        String query = "INSERT INTO Books (title, author, genre, publication_year, isbn, is_available) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, String.valueOf(book.getGenre()));
            preparedStatement.setInt(4, book.getPublicationYear());
            preparedStatement.setString(5, book.getISBN());
            preparedStatement.setBoolean(6, book.isAvailable());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                logger.log("Successfully added book: " + book.getTitle() + " by " + book.getAuthor());
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Update Book Data
    public int updateBook(String isbn,Book book) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance
        
        
        // SQL query to update book details
        String updateQuery = "UPDATE Books SET title = ?, author = ?, genre = ?, publication_year = ?, isbn = ? where isbn = " + isbn;

        try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
            // Set the query parameters
            updateStmt.setString(1, book.getTitle());           // Title
            updateStmt.setString(2, book.getAuthor());          // Author
            updateStmt.setString(3, book.getGenre().name());    // Genre (as a string)
            updateStmt.setInt(4, book.getPublicationYear());    // Publication year
            updateStmt.setString(5, book.getISBN());                     // ISBN for WHERE clause

            // Execute the update query
            int rowsUpdated = updateStmt.executeUpdate();
            if (rowsUpdated > 0) {
                logger.log("Successfully updated book: " + book.getTitle() + " by " + book.getAuthor());
                return 1;
            } else {
                logger.log("No book found with ISBN: " + book.getISBN());
                return 0;
            }
        } catch (SQLException e) {
            // Log and handle SQL exceptions
            logger.log("Error during updating book: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }

    // Delete Book Data
    public int deleteBook(String ISBN) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance
        String query = "DELETE FROM Books WHERE isbn = ?";


        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ISBN);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                logger.log("Successfully delete book: " + ISBN);
                return 1;
            } else {
                logger.log("Failed to delete book: " + ISBN);
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    // Borrow Book
    public int borrowBook(String isbn){
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance
        
        String checkQuery  = "SELECT * FROM Books WHERE isbn = ?";
        String updateQuery = "UPDATE Books SET is_available = false WHERE isbn = ?";
        try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
            checkStmt.setString(1, isbn);
            try (ResultSet resultSet = checkStmt.executeQuery()) {
                if (resultSet.next()) {
                    boolean isAvailable = resultSet.getBoolean("is_available");
                    if (isAvailable) {
                        // Proceed to update the book availability
                        try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
                            updateStmt.setString(1, isbn);
                            int rowsUpdated = updateStmt.executeUpdate();

                            if (rowsUpdated > 0) {
                                logger.log("Book with ISBN " + isbn + " borrowed successfully.");
                                addTransaction(isbn, HomeUser.userId, TransactionType.BORROW);
                                return 1;
                            } else {
                                logger.log("Failed to borrow the book with ISBN " + isbn + ".");
                                return 0;
                            }
                        }
                    } else {
                        logger.log("Book with ISBN " + isbn + " is already borrowed.");
                        return -1;
                    }
                } else {
                    logger.log("Book with ISBN " + isbn + " does not exist in the database.");
                    return -2;
                }
            }   
        } catch (SQLException e) {
            logger.log("Error during borrowing book: " + e.getMessage());
            e.printStackTrace();
            return -3;
        }
    }
    
    // Return Book
    public int returnBook(String isbn){
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance
        
        String checkQuery  = "SELECT * FROM Books WHERE isbn = ?";
        String updateQuery = "UPDATE Books SET is_available = true WHERE isbn = ?";
        try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
            checkStmt.setString(1, isbn);
            try (ResultSet resultSet = checkStmt.executeQuery()) {
                if (resultSet.next()) {
                    boolean isAvailable = resultSet.getBoolean("is_available");
                if (!isAvailable) {
                        // Proceed to update the book availability
                        try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
                            updateStmt.setString(1, isbn);
                            int rowsUpdated = updateStmt.executeUpdate();

                            if (rowsUpdated > 0) {
                                logger.log("Book with ISBN " + isbn + " return successfully.");
                                addTransaction(isbn, HomeUser.userId, TransactionType.RETURN);
                                return 1;
                            } else {
                                logger.log("Failed to return the book with ISBN " + isbn + ".");
                                return 0;
                            }
                        }
                    } else {
                        logger.log("Book with ISBN " + isbn + " is already returned.");
                        return -1;
                    }   
                } else {
                    logger.log("Book with ISBN " + isbn + " does not exist in the database.");
                    return -2;
                }
            }
        } catch (SQLException e) {
            logger.log("Error during returning book: " + e.getMessage());
            e.printStackTrace();
            return -3;
        }
    }
    
    public boolean bookIsExist(String isbn){
        String query = "SELECT * FROM Books WHERE isbn = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, isbn);
            try( ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()){
                    String ISBN = resultSet.getString("isbn");
                    return true;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public Book selectBook(String isbn) {
        String query = "SELECT * FROM Books WHERE isbn = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, isbn);
            try( ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()){
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    String genre = resultSet.getString(String.valueOf("genre"));
                    int publicationYear = resultSet.getInt("publication_year");
                    String ISBN = resultSet.getString("isbn");
                    
                    // Builder Design Pattern
                    BookBuilder builder = new BookBuilder();
                    Book book = builder.setTitle(title)
                            .setAuthor(author)
                            .setPublicationYear(publicationYear)
                            .setISBN(ISBN).build(BookType.valueOf(genre));
                    return book;
                } else {
                    return null;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }

    // Show All Book Data
    public DefaultTableModel listBooks() {
        String query = "SELECT * FROM Books";
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Title", "Author", "Genre", "Pub. Year", "ISBN"}, 0);
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            
            // Clear the table before adding new rows
            tableModel.setRowCount(0);
            
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                int publicationYear = resultSet.getInt("publication_year");
                String isbn = resultSet.getString("isbn");
                
                // Add a row to the table model
                tableModel.addRow(new Object[]{title, author, genre, publicationYear, isbn});    
            }
            return tableModel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // -------------------------------- User Management --------------------------------------

    // Login User
    public boolean loginUser(String email, String password, UserType userType) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance
        String query = "SELECT * FROM users WHERE email = ? AND password = ? AND user_type = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password); 
            preparedStatement.setString(3, valueOf(userType)); 

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // If user is found, retrieve their data
                    int userId = resultSet.getInt("user_id");
                    String name = resultSet.getString("name");
                    // Log successful login
                    logger.log("User logged in successfully: " + name + "ID: " + userId + "Email: " + email);
                    if (userType == UserType.ADMIN)
                        HomeAdmin.userId = userId;
                    else
                        HomeUser.userId = userId;
                    return true;
                    // Create and return the User object
                } else {
                    // Log failed login
                    logger.log("Failed login attempt for user: " + email);
                    return false;
                }
            }
        } catch (SQLException e) {
            logger.log("Error during login for user: " + email + " - " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Add User
    public boolean addUser(User user) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance
        
        String getMaxIdQuery = "SELECT MAX(user_id) FROM Users";
        String insertQuery = "INSERT INTO Users (user_id, name, email, user_type, password) VALUES (?, ?, ?, ?, ?)";


        try {
            // Step 1: Retrieve the highest user_id
            int newUserId = 1; // Default to 1 if the table is empty
            try (PreparedStatement getMaxIdStmt = connection.prepareStatement(getMaxIdQuery);
                 ResultSet resultSet = getMaxIdStmt.executeQuery()) {
                if (resultSet.next()) {
                    int maxId = resultSet.getInt(1);
                    newUserId = maxId + 1; // Increment the highest ID by 1
                }
                user.setId(newUserId);
            }

            // Step 2: Insert the new user with the calculated ID
            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                insertStmt.setInt(1, newUserId);
                insertStmt.setString(2, user.getUsername());
                insertStmt.setString(3, user.getEmail());
                insertStmt.setString(4, user.getRole().name());
                insertStmt.setString(5, user.getPassword());
                int rowsInserted = insertStmt.executeUpdate();
                if (rowsInserted > 0) {
                    logger.log("Successfully added user: " + user.getUsername() + " with role: " + user.getRole());
                    return true;
                } else {
                    logger.log("Failed to add user: " + user.getUsername() + " with role: " + user.getRole());
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.log("Error adding user: " + user.getUsername() + " - " + e.getMessage());
            return false;
        }
    }

    // Update User
    public boolean updateUser(User user,int userId) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance

        String query = "UPDATE Users SET name = ?, email = ?, user_type = ? WHERE user_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, String.valueOf(user.getRole()));
            preparedStatement.setInt(4, userId);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                logger.log("Successfully update user: " + user.getUsername() + "role: " + user.getRole());
                return true;
            } else {
                logger.log("Failed to update user: " + user.getUsername() + "role: " + user.getRole());
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete User
    public boolean deleteUser(int userId) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance

        String query = "DELETE FROM Users WHERE user_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, userId);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                logger.log("Successfully deleted user.");
                return true;
            } else {
                logger.log("Failed to update user.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Show All Data User
    public void listUsers() {
        String query = "SELECT * FROM Users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String userType = resultSet.getString("user_type");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------- Transaction Management --------------------------------------

    // Add Transaction Process
    public boolean addTransaction(String isbn, int userId, TransactionType transactionType) {
        Logger logger = Logger.getInstance(); // Get the singleton Logger instance

        String insertTransactionQuery = "INSERT INTO Transactions (user_id, isbn, transaction_type) VALUES (?, ?, ?)";

        try (PreparedStatement insertTransactionStatement = connection.prepareStatement(insertTransactionQuery)) {
            insertTransactionStatement.setInt(1, userId); // Assuming User has a method getId()
            insertTransactionStatement.setString(2, isbn);
            insertTransactionStatement.setString(3, String.valueOf(transactionType));

            int rowsInserted = insertTransactionStatement.executeUpdate();
            if (rowsInserted > 0) {
                logger.log("Transaction added successfully for book ISBN: " + isbn + ", user ID: " + userId);
                return true;
            } else {
                logger.log("Failed to add transaction for book ISBN: " + isbn + ", user ID: " + userId);
                return false;
            }
        } catch (SQLException e) {
            logger.log("Error while adding transaction: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Show All Transaction Data
    public DefaultTableModel listTransactions() {
    
        String query = "SELECT * FROM Transactions";
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Trans ID", "User ID", "ISBN", "Trans Type", "Date"}, 0);
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            //Clear the table before adding rows
            tableModel.setRowCount(0);
            
            while (resultSet.next()) {
                
                int transactionId = resultSet.getInt("transaction_id");
                int userId = resultSet.getInt("user_id");
                String isbn = resultSet.getString("isbn");
                String transactionType = resultSet.getString("transaction_type");
                String transactionDate = resultSet.getString("transaction_date");
                
                // Add a row to the table model
                tableModel.addRow(new Object[]{transactionId, userId, isbn, transactionType, transactionDate});
                
            }
                return tableModel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}