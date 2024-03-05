// Import the Scanner class form java.util package
import java.util.Scanner;;

// Define a public class called CirleAreaCalculator
public class CircleAreaCalculator {
    // Define the main method

    public static void main(String[] args) {
        // Create a scanner object to read the input from user
        Scanner scanner = new Scanner(System.in);

        // Enter the radius value
        System.out.print("Enter the radius of the circle: ");

        // Read the value as a double from the user
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Print out the area of a triangle
        System.out.print("The area of the circle: " + area);

        // Close the scanner class
        scanner.close();

    }
    
}
