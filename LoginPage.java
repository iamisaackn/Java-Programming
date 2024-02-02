// Importing necessary packages
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

// User class to store user details
class User {
    String username;
    String admission;
    String password;

    // User constructor
    User(String username, String admission, String password) {
        this.username = username;
        this.admission = admission;
        this.password = password;
    }
}

// LoginPage class for handling user sign up and login
public class LoginPage {

    // HashMap to store User objects with their username as the key
    Map<String, User> userMap = new HashMap<>();
    String username, fullname, admission, password;

    // SignUp method for new users
    public void SignUp() {
        // Input User Name
        username = JOptionPane.showInputDialog("Enter UserName: ");

        // Input Admission
        admission = JOptionPane.showInputDialog("Enter student admission: ");

        // Input Password
        password = JOptionPane.showInputDialog("Enter password: ");

        // Create new User object and store it in the HashMap
        User user = new User(username, admission, password);
        userMap.put(username, user);
    }

    // Login method for existing users
    public void Login() {
        // Input UserName
        username = JOptionPane.showInputDialog("Enter UserName: ");

        // Input Password
        password = JOptionPane.showInputDialog("Enter Password: ");

        // Validate the username and password
        if(userMap.containsKey(username) && userMap.get(username).password.equals(password)) {
            JOptionPane.showMessageDialog(null, "Successfully logged in. Welcome, " + username + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Wrong username or password. Please try again.");
        }
    }
    
    // Main method
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        // Ask the user if they want to sign up
        int option = JOptionPane.showConfirmDialog(null, "Would you like to sign up?", "Choose", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            loginPage.SignUp();
        }
        // Call the Login method
        loginPage.Login();
    }
}
