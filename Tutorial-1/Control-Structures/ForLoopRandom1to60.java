// importing Random class from java.util package
import java.util.Random;

// Declaring a public class
public class ForLoopRandom1to60 {
    
    // Declares the main method that the JVM calls to start the program
    public static void main(String[] args) {
        
        // Creating a new instatance for the Random class that can be used to create pseudorandom numbers.
        Random rand = new Random();

        // Declaring an integer variable 'sum' and initializing it to 0.
        int sum = 0;

        // For loop initialization, condition, and increment/decrement. Starts a loop that iterate 60 times.
        for(int x = 1; x <= 60; x ++){

            // Inside the loop a random integer btwn 1 and 30 inclusive is generated.
            int num = rand.nextInt(30) + 1;

            // Output value of num in console.
            System.out.println(num);
            
            // Adds the value of num to the current value of sum
            sum += num;
        }

        // After the loop has finished print the sum
        System.out.println("The sum is " + sum);
    }
}
