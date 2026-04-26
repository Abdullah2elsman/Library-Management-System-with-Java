package librarymanagementsystem.Users;

public class RegularUser extends User {

    public RegularUser(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public UserType getRole() {
        return UserType.REGULAR_USER;
    }
}
