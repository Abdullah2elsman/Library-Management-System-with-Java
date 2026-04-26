package librarymanagementsystem.Users;

public abstract class User {
    private String username;
    private String email;
    private String password;
    private int id;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }

    public abstract UserType getRole();

    @Override
    public String toString() {
        return "User: " + username + ", Email: " + email + ", Role: " + getRole();
    }
}
