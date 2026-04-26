# Library Management System

A Java Swing desktop application for managing a library's books, users, and transactions. Built with NetBeans and backed by a MySQL database.

---

## Features

**Admin**
- Insert, update, and delete books
- View all books in the catalog
- View all borrow/return transactions

**Regular User**
- Browse the book catalog
- Borrow and return books

**Authentication**
- Login and sign-up with role selection (Admin / Regular User)
- Credentials validated against the database

---

## Tech Stack

- Java (Swing GUI)
- MySQL (via JDBC — `mysql-connector-j-9.1.0.jar`)
- NetBeans IDE (Ant build system)

---

## Design Patterns Used

| Pattern | Where |
|---|---|
| Singleton | `Database`, `Logger` |
| Factory | `BookFactory`, `UserFactory` |
| Builder | `BookBuilder` |
| Adapter | `NewspaperAdapter` (adapts `Newspaper` to `Book` interface) |
| Prototype | `Newspaper` implements `Prototype` for cloning |

---

## Project Structure

```
src/librarymanagementsystem/
├── Book/               # Book interface, types, and concrete implementations
├── Users/              # User abstract class, Admin, RegularUser, factory
├── Newspaper/          # Newspaper entity with Adapter and Prototype patterns
├── DatabaseAndLogger/  # Singleton DB connection, Logger, TransactionType enum
├── Demo.java           # Application entry point
├── Login.java          # Login screen
├── SignUp.java         # Registration screen
├── HomeAdmin.java      # Admin dashboard
├── HomeUser.java       # User dashboard
├── Insert.java         # Add book screen
├── Update.java         # Update book screen
├── Delete.java         # Delete book screen
├── Show.java           # Browse books screen
├── Borrow.java         # Borrow book screen
├── Return.java         # Return book screen
└── ShowTran.java       # View transactions screen
```

---

## Database Setup

The app connects to a local MySQL database named `library`.

Default connection config (in `Database.java`):
```
URL:      jdbc:mysql://localhost:3306/library
User:     root
Password: 123456
```

You'll need three tables:

```sql
CREATE TABLE Books (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    title           VARCHAR(255),
    author          VARCHAR(255),
    genre           VARCHAR(50),
    publication_year INT,
    isbn            VARCHAR(50) UNIQUE,
    is_available    BOOLEAN DEFAULT TRUE
);

CREATE TABLE Users (
    user_id   INT PRIMARY KEY,
    name      VARCHAR(255),
    email     VARCHAR(255) UNIQUE,
    password  VARCHAR(255),
    user_type VARCHAR(50)
);

CREATE TABLE Transactions (
    transaction_id   INT AUTO_INCREMENT PRIMARY KEY,
    user_id          INT,
    isbn             VARCHAR(50),
    transaction_type VARCHAR(10),
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## Running the App

1. Make sure MySQL is running and the `library` database is set up.
2. Update credentials in `Database.java` if needed.
3. Build and run via NetBeans, or from the command line:

```bash
ant run
```

The entry point is `Demo.java` — it launches the Login window.

---

## Logging

All operations (login attempts, book CRUD, borrow/return) are logged to `application.log` in the project root using a thread-safe Singleton `Logger`.

---

## Book Types

| Type | Description |
|---|---|
| `SOFTWARE_ENGINEERING` | Software engineering books |
| `MANAGEMENT` | Management and business books |
| `ARTIFICIAL_INTELLIGENCE` | AI and ML books |
| `NEWSPAPER` | Newspapers (adapted via `NewspaperAdapter`) |
