/*
3. Draw the Flow chart that will will print the integers 1-100 into two columns Sum and odd and
the corresponding sums as shown below.
Evens       Odds
..
..
..
..
..
..
..
SumEvens    SumOdds
a) Write the corresponding program of the above flowchart.
 */


public class Question3 {
    
    public static void main(String args[]) {
        // Declaration
        int SumEvens = 0;
        int SumOdds = 0;

        // Iterate from number 1 to 100
        for(int num = 1; num <= 100; num++) {
            
            // Initialization

            // If-Else Statement
            if(num%2 == 0) {
                System.out.println(num + " is an even number.");
                SumEvens += num; // Adds the the Sum of Evens
            } else {
                System.out.println(num + " is an odd number.");
                SumOdds += num;
            }
        } // For Loop
        System.out.println(SumEvens + ": Sum of Even " + " " + SumOdds + ": Sum of Odd");

    } // Main Method
} // Class Q3

