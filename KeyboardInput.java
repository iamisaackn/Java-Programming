import javax.swing.JOptionPane; // Importing JOptionPane class from javax.swing package

public class KeyboardInput { // Defining a public class named KeyboardInput
    public static void main (String[] args) { // Main method that executes when the program runs

        // This line of code opens a dialog box where the user can input a string
        // The dialog box will have the message "Insert a string"
        String inputString = JOptionPane.showInputDialog("Insert a string");

        // This line of code prints the string entered by the user in the console
        System.out.println(inputString);

        // This line of code is used to terminate the currently running Java Virtual Machine
        System.exit(0);
    }
}
