// Import the Scanner class from the java.util package
import java.util.Scanner;

class Rectangle {
    private int width;
    private int length;

    // Constructor
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // Getter for width
    public int getWidth() {
        return this.width;
    }

    // Getter for length
    public int getLength() {
        return this.length;
    }

    // Method to calculate area
    public int area() {
        return this.width * this.length;
    }
}

public class RectMain3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the width
        System.out.println("Enter the width");
        int width = scan.nextInt();

        // Prompt the user to enter the length
        System.out.println("Enter the length");
        int length = scan.nextInt();

        // Create a new Rectangle object with the user's input
        Rectangle rectangle = new Rectangle(width, length);

        // Call the printRectangle method and pass the Rectangle object
        printRectangle(rectangle);
    }

    // Method that prints the details of the Rectangle object
    public static void printRectangle(Rectangle rectangle){
        System.out.println("The width of the rectangle is " + rectangle.getWidth());
        System.out.println("The length of the rectangle is " + rectangle.getLength());
        System.out.println("The area of the rectangle is " + rectangle.area());
    } // printRectangle close
} // RectMain3 close
