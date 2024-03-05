// Import the java.util package
import java.util.Random;

class Rectangle {
    int width;
    int length;

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

public class RectMain4 {

    public static void main(String[] args) {
        // Create a Rectangle object using the getRectangle method
        Rectangle rectangle = getRectangle();

        // Call the printRectangle method and pass the Rectangle object
        printRectangle(rectangle);
    }

    // Method that creates a Rectangle object with random width and length
    public static Rectangle getRectangle() {
        Random rand = new Random();
        int width = rand.nextInt(20) + 1;
        int length = rand.nextInt(10) + 1;
        return new Rectangle(width, length);
    }

    // Method that prints the details of the Rectangle object
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("The width of the rectangle is " + rectangle.getWidth());
        System.out.println("The length of the rectangle is " + rectangle.getLength());
        System.out.println("The area of the rectangle is " + rectangle.area());
    } 
} //class end


