import java.util.HashMap;

public class LoginManager {
    private HashMap<String, User> users = new HashMap<>();

    public LoginManager() {
        // Adding a default user for login testing
        users.put("Guest", new User("Guest", "Faheem123"));
    }

    public boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.checkPassword(password);
    }
}
