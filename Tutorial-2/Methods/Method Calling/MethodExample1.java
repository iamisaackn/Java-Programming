public class MethodExample1 {
    // Declaring the method
    public static int sum(int a, int b, int c) {
        // The method takes three integers as parameters and returns their sum
        return a + b + c;
    }

    public static void main(String[] args) {
        // Providing needed data
        int x = 45, y = 67, z = 34;

        // Calling method sum and storing the result in variable 's'
        int s = sum(x, y, z);

        // Printing the result
        System.out.println("Sum is " + s);
    } // End of main
} // End of class

