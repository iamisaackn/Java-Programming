/* 

// This class demonstrates the use of various methods in the Math class
public class MathMethods {
    // The main method is the entry point of any Java application
    public static void main(String[] args) {
        System.out.println("Working with Math Class Methods");

        // Declare and initialize two integer variables
        int x = 4;
        int m = 3; // This is a static variable

        // Generate a random integer between 2 and 10 (inclusive)
        // Math.random() generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        // Math.ceil() rounds up the value to the nearest integer
        // The result is then cast to an integer and added to 2
        int cat1 = 2 + (int)(Math.ceil(Math.random() * 8)); // This is a local variable

        // Math.max() returns the maximum of two numbers
        System.out.println(Math.max(m, x));

        // Math.min() returns the minimum of two numbers
        System.out.println(Math.min(m, x));

        // Math.pow() raises the first argument to the power of the second argument
        // Math.sqrt() returns the square root of the argument
        // This line calculates the square root of m raised to the power of x
        System.out.println(Math.sqrt(Math.pow(m, x)));

        // Math.max() returns the maximum of two numbers
        System.out.println(Math.max(m, x));
    }
}


*/

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value x: ");
        int x = sc.nextInt();

        System.out.println("Enter value m: ");
        int m = sc.nextInt();
        int cat1 = 2 + (int)(Math.ceil(Math.random() * 8));

        System.out.println(Math.max(m, x));
        System.out.println(Math.min(m, x));

        System.out.println(Math.pow(m, 2));
        System.out.println(Math.pow(x, 2));

        System.out.println(Math.sqrt(m));
        System.out.println(Math.sqrt(x));

        System.out.println(Math.pow(m, 3));
        System.out.println(Math.pow(x, 3));

        System.out.println(Math.cbrt(m));
        System.out.println(Math.cbrt(x));

        
    }
}