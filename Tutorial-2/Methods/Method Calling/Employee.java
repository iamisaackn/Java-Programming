// Importing necessary classes
import java.awt.Rectangle;

// Class declaration
public class Employee {
    // Method declarations
    public static void method1() {
        // Method 1 does not return a value
    }

    public static int method2() {
        // Method 2 returns an integer
        return 0; // Placeholder return statement
    }

    public static double method3() {
        // Method 3 returns a double
        return 0.0; // Placeholder return statement
    }

    public static Rectangle rectMethod4() {
        // A method that returns a Rectangle object
        return new Rectangle(); // Placeholder return statement
    }

    public static Employee empMethod5() {
        // A method that returns an Employee object
        return new Employee(); // Placeholder return statement
    }

    public static Employee[] empMethod6() {
        // A method that returns an array of Employee objects
        return new Employee[0]; // Placeholder return statement
    }

    public static void main(String[] args) {
        // Calling the methods
        method1(); // Method 1 is called by itself. This is because it is of type void

        int s = method2(); // Method 2 is called and its return value is stored in 's'
        double r = method3(); // Method 3 is called and its return value is stored in 'r'

        Rectangle R1 = rectMethod4(); // rectMethod4 is called and its return value is stored in 'R1'
        Employee E = empMethod5(); // empMethod5 is called and its return value is stored in 'E'
        Employee[] Emps = empMethod6(); // empMethod6 is called and its return value is stored in 'Emps'
    } // End of main method
} // End of class
