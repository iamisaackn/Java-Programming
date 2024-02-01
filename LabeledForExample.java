public class LabeledForExample {
    public static void main(String[] args){
        // This is a label named 'aa'
        aa:
        // This is the outer loop which will run from i=1 to i=3
        for(int i = 1; i <= 3; i++) {
            // This is a label named 'bb'
            bb: 
            // This is the inner loop which will run from j=1 to j=3
            for (int j = 1; j <= 3; j++) {
                // If i equals 2 and j equals 2, it will break the outer loop labeled 'aa'
                if(i == 2 && j == 2) {
                    break aa;
                }
                // This will print the current values of i and j
                System.out.println(i + " " +j);
            }
        }
    }
}
