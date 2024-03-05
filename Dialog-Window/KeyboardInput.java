// Import the JOptionPane class from the javax.swing package
// JOptionPane provides a set of methods for creating and displaying dialog boxes
import javax.swing.JOptionPane;

// Define a public class named KeyboardInput
public class KeyboardInput {
    // The main method is the entry point of any Java application
    public static void main (String[] args) {
        // The showInputDialog method of JOptionPane opens a dialog box where the user can input a string
        // The argument to this method is the message that will be displayed in the dialog box
        String inputString = JOptionPane.showInputDialog("Insert a string");

        // Print the string entered by the user to the console
        System.out.println(inputString);

        // The exit method of the System class is used to terminate the currently running Java Virtual Machine
        // The argument to this method is a status code. A status code of 0 indicates normal termination
        System.exit(0);
    }
}
