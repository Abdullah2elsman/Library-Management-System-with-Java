package librarymanagementsystem.Users;

public class Admin extends User {
    
    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public UserType getRole() {
        return UserType.ADMIN;
    }
}

