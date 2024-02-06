// Importing packages
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

class User {
    String username;
    String admission;
    String password;

    User(String username, String admission, String password) {
        this.username = username;
        this.admission = admission;
        this.password = password;
    }
}

public class LoginPage {

    Map<String, User> userMap = new HashMap<>();
    String username, fullname, admission, password;

    public void SignUp() {
        // Input User Name
        username = JOptionPane.showInputDialog("Enter UserName: ");

        // Input Admission
        admission = JOptionPane.showInputDialog("Enter student admission: ");

        // Input Password
        password = JOptionPane.showInputDialog("Enter password: ");

        // Store username, admmission, password
        User user = new User(username, admission, password);
        userMap.put(username, user);
    }

    public void Login() {
        // Input UserName
        username = JOptionPane.showInputDialog("Enter UserName: ");

        // Input Password
        password = JOptionPane.showInputDialog("Enter Password: ");

        // Validation
        if(user.containsKey(username) && user.get(username).equals(password)) {
                JOptionPane.showMessageDialog(null, "Successfully logged in. Welcome, " + username + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong username or password. Please try again.");
            }
    }
    
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        int option = JOptionPane.showConfirmDialog(null, "Would you like to sign up?", "Choose", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            loginPage.SignUp();
        }
        loginPage.Login();
    }
}
