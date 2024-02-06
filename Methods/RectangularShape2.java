// This is the main class named ContinueExample2
public class RectangularShape2 {
    // This is the main method that the Java Virtual Machine (JVM) calls when the program starts
    public static void main(String[] args) {
        // This outer loop will run from 1 to 10
        for(int i=1; i<=10; i++){
            // This inner loop will also run from 1 to 10
            for(int j=1; j<=10; j++){
                // It prints the product of the current values of i and j, followed by a tab space
                System.out.print(i*j + "\t");
            }
            // This prints a newline after each row of the multiplication table
            System.out.println();
        }
    } 
}
 
 