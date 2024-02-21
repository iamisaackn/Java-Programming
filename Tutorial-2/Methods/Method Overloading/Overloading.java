public static void main(String[] args) {
    int a = 11;
    int b = 6;
    double c = 7.3;
    double d = 9.4;
    // Call the min function for integers
    int result1 = min(a, b);
    // Call the min function for doubles
    double result2 = min(c, d);
    // Print the results
    System.out.println("Minimum Value = " + result1);
    System.out.println("Minimum Value = " + result2);
}
// Min function for integers
public static int min(int n1, int n2) {
    int min;
    if (n1 > n2)
        min = n2; // If n1 is greater than n2, then n2 is the minimum
    else
        min = n1; // If n1 is not greater than n2, then n1 is the minimum
    return min;
}
// Min function for doubles
public static double min(double n1, double n2) {
    double min;
    if (n1 > n2)
        min = n2; // If n1 is greater than n2, then n2 is the minimum
    else
        min = n1; // If n1 is not greater than n2, then n1 is the minimum
    return min;
}

