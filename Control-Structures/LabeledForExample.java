public class LabeledForExample {
    public static void main(String[] args){
        // 'aa' is a label used for the outer loop
        aa:
        // Outer loop starts here, iterating 'i' from 1 to 3
        for(int i = 1; i <= 3; i++) {
            // 'bb' is a label used for the inner loop, but it's not used in this code
            bb: 
            // Inner loop starts here, iterating 'j' from 1 to 3 for each iteration of 'i'
            for (int j = 1; j <= 3; j++) {
                // If 'i' equals 2 and 'j' equals 2, the control will break out of the outer loop labeled 'aa'
                if(i == 2 && j == 2) {
                    break aa;
                }
                // The current values of 'i' and 'j' are printed to the console
                System.out.println(i + " " +j);
            }
        }
    }
}
