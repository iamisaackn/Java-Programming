/* 

// This class demonstrates the generation of random numbers
public class MathRandom {
    // The main method is the entry point of any Java application
    public static void main(String[] args) {
        // Math.random() generates a random double value between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println(Math.random()); // Prints a random double value between 0.0 and 1.0

        // Math.random() * 10 generates a random double value between 0.0 (inclusive) and 10.0 (exclusive)
        System.out.println(Math.random() * 10); // Prints a random double value between 0.0 and 10.0
    }
}

*/

public class MathRandom {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.ceil(Math.random()) * 10);

        double x = Math.random();
        System.out.println(Math.rint(x)); // function rounds the decimal number to the nearest whole number

        // LOGARITHM
        double y = Math.random();
        System.out.println(Math.log(y));
        System.out.println(Math.log10(y));
        System.out.println(Math.log1p(y));
    }
}