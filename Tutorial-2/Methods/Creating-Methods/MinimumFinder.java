public class MinimumFinder {
    public static int minimum(int n1, int n2) {
        return (n1 > n2) ? n2 : n1;
    }

    public static void main(String[] args) {
        int n1, n2, result;

        n1 = 42;
        n2 = 60;

        result = minimum(n1, n2);
        System.out.println("The minimum number is " + result);
    }
}