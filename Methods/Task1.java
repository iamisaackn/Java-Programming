public class Task1 {
    /**
     * This method calculates the power of two integers.
     * @param x The base.
     * @param y The exponent.
     * @return The result of x raised to the power y.
     */
    public static int power(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public static void main(String[] args) {
        // Define two integers
        int a = 2;
        int b = 3;

        // Call the power method with a and b as arguments
        int result = power(a, b);

        // Print the result
        System.out.println(a + " raised to the power of " + b + " is " + result);
    }
}
