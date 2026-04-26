package librarymanagementsystem.Users;


public class UserFactory {
    public static User createUser(UserType userType, String username, String email, String password) {

        return switch (userType) {
            case ADMIN -> new Admin(username, email, password);
            case REGULAR_USER -> new RegularUser(username,email, password);
            default -> throw new IllegalArgumentException("Unknown user type: " + userType);
        };
    }
}
