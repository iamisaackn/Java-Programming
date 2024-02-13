/*
Draw the Flow chart that will print all prime numbers between 1 and 100 and their count.
a) Write the Corresponding program of the above flowchart.
 */

public class Question4 {
    
    public static void main(String args[]) {

        // Initialize the sum
        int sum = 0;

        // For Loop
        for(int prime = 1; prime <= 100; prime++) {

            // If Statement
            if(isPrime(prime)) {
                System.out.println(prime + ": It is a Prime Number."); // Print the prime number
                sum++; // Increament the sum of prime numbers
            } // If Statement

        } // For Loop

        // Print the total sum of the prime numbers
        System.out.println(sum + ": Sum of Prime Numbers");
    } // main method

    // Function
    public static boolean isPrime(int num) {

        // If Ststement
        if(num <= 1){
            return false; // 1 and anything less are not Prime Numbers
        } 

        // For Loop
        for(int i = 2; i < num; i++) {
            
            // If Statement
            if(num % i == 0) {
                return false; // Prime numbers aren't divisible by 2
            }
        }

        return true; // Prime number
    } // Function
} // Class
