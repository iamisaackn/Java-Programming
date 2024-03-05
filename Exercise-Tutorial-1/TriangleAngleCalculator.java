// Import packages
import java.util.Scanner;

public class TriangleAngleCalculator {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input angle S and Z
        System.out.println("Enter value of angle S: ");
        double angleS = scanner.nextDouble();

        System.out.println("Enter value of angle Z: ");
        double angleZ = scanner.nextDouble();

        // Angle X
        double angleX = 180 - angleZ;

        // Angle Y
        double angleY = 180 - (angleX + angleS);

        // Output angle X and Y
        System.out.println("Angle X: " + angleX);
        System.out.println("Angle Y: " + angleY);

    }
}
