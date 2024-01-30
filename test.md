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

    public void SignUp() {
        String username = JOptionPane.showInputDialog("Enter UserName: ");
        String admission = JOptionPane.showInputDialog("Enter student admission: ");
        String password = JOptionPane.showInputDialog("Enter password: ");

        User user = new User(username, admission, password);
        userMap.put(username, user);

        JOptionPane.showMessageDialog(null, "Successfully signed up. You can now log in.");
    }

    // Rest of your code...
}
