public class ProgramOperator {
    
    public static void question1() {
         // Write Java program using the += operator and the while loop to generate the sum of 1 to 100
         int sum = 0;
         int i = 1;

         while (i <= 100) {
            sum += i; 
            i++;
         }
         System.out.println("Answer: " + sum);
    }

    public static void question2() {
        // Write a program using the -= operator and the do while loop to generate the sum of 1 to 100
        int sum = 0;
        int x = 100; 

        do {
            sum -= x; 
            x--;
        } while(x >= 1); // The loop should continue until 'x' is greater than or equal to 1
        System.out.println("Answer: " + sum);
    }
}
