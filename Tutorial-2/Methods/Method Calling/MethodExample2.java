public class MethodExample2 {
    public static void main(String[] args) {
        int a = 11; // Declare and initialize variable 'a'
        int b = 6;  // Declare and initialize variable 'b'

        // Call the method 'minFunction' with 'a' and 'b' as arguments
        // The result is stored in the variable 'c'
        int c = minFunction(a, b);

        // Print the minimum value
        System.out.println("Minimum Value = " + c);
    }

    /** 
     * A method that returns the minimum of two numbers 
     */
    public static int minFunction(int n1, int n2) {
        int min; // Declare variable 'min'

        // If 'n1' is greater than 'n2', 'min' is 'n2'
        // Otherwise, 'min' is 'n1'
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min; // Return the minimum value
    }
}
