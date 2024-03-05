import java.util.*; // Importing the java utility package

public class ScannerTest2{ // Defining a public class named ScannerTest2
    public static void main(String args[]){ // Main method that executes when the program runs

        String input = "10 tea 20 coffee 30 tea buiscuits"; // A string with numbers and words

        // Creating a new Scanner object 's' that scans 'input'. It uses whitespace ("\\s") as the delimiter
        Scanner s = new Scanner(input).useDelimiter("\\s");

        System.out.println(s.nextInt()); // Prints the next integer it encounters in 'input', which is 10

        System.out.println(s.next()); // Prints the next string it encounters in 'input', which is 'tea'

        System.out.println(s.nextInt()); // Prints the next integer it encounters in 'input', which is 20

        System.out.println(s.next()); // Prints the next string it encounters in 'input', which is 'coffee'

        s.close(); // Closes the scanner
    }
}
