import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Close the scanner to avoid recource leak
        scanner.close();

        // Calculate the area of the triangle
        double area = calculateTriangleArea(base, height);

        // Display the results
        System.out.print("The area of the triangle is: " + area);
    }

    // Method to calculate area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}