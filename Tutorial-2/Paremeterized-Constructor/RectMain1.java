class Rectangle {
    int width;
    int length;

    // Default constructor
    public Rectangle() {
        width = 10;
        length = 5;
    }

    // Parameterized constructor
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // Method to calculate area
    public int area() {
        return width * length;
    }

    // Method to calculate perimeter
    public int perimeter() {
        return 2 * (width + length);
    }

    // Getter and setter methods
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
} // class end

public class RectMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Length: " + rect.getLength());
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        rect.setWidth(7);
        rect.setLength(12);
        System.out.println("New Width: " + rect.getWidth());
        System.out.println("New Length: " + rect.getLength());
        System.out.println("New Area: " + rect.area());
        System.out.println("New Perimeter: " + rect.perimeter());
    } // main close
} // RectMain close

