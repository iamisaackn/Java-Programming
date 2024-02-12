public class ForLoop1to10 {

    public static void main(String[] args) {
        
        // Assigning a variable
        int sum = 0;

        // initialization, condition, increment or decrement
        for(int x = 1; x <= 10; x++) {
            
            // Output the value
            System.out.println(x);

            // Sum of the integer
            sum += x;
        }

        System.out.println("The sum is " + sum);
    }
}
