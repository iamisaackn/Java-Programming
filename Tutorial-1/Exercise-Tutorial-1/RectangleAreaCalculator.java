// Import the Scanner class from java.util package
import java.util.Scanner;

// Define a public class named RectangleAreaCalculator
public class RectangleAreaCalculator {
    // Define the main method which is the entry point of any Java application
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        // Read the length as a double value from the user
        double length = scanner.nextDouble();
        
        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        // Read the width as a double value from the user
        double width = scanner.nextDouble();
        
        // Calculate the area of the rectangle by multiplying length and width
        double area = length * width;
        
        // Print the calculated area to the console
        System.out.print("The area of the rectangle is " + area);
        
        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
