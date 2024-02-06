public class MethodExample2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;

        // Calling the method
        int c = minFunction(a, b);

        System.out.println("Minimum Value = " + c);
    }

    /** Returns the minimum of two numbers */
    public static int minFunction(int n1, int n2) {
        return Math.min(n1, n2);
    }
}
