// Import the Scanner class from java.util package
import java.util.Scanner;

// Define a class named ScannerTest
class ScannerTest{
    // Define the main method which is the entry point of any Java application
    public static void main(String args[]){
        // Create a new Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        
        // Prompt the user to enter their student number
        System.out.println("Enter your Student Number: ");
        // Read the student number as an integer value from the user
        int stnum=sc.nextInt();
        
        // Prompt the user to enter their first name
        System.out.println("Enter your First name: ");
        // Read the first name as a string value from the user
        String name=sc.next();
        
        // Prompt the user to enter their school fees
        System.out.println("Enter your School Fees: ");
        // Read the school fees as a double value from the user
        double fee=sc.nextDouble();
        
        // Print the student number, name, and school fees to the console
        System.out.println("Student Number: "+stnum+"Name: "+name+"Shool Fees: "+fee);
        
        // Close the scanner object to prevent memory leaks
        sc.close();
    }
}
