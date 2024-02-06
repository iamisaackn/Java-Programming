public class MethodExample1 {
    // Declaring the method
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Providing needed data
        int x = 45, y = 67, z = 34;

        // Calling method sum
        int s = sum(x, y, z);

        System.out.println("Sum is " + s);
    } // End of main

    // Note: The method can be declared after the main method
} // End of class
