public class LabeledForLoop {
    public static void main(String[] args){
        aa: // This is a label for the outer loop
        for(int i = 1; i <= 3; i++) {
            bb: // This is a label for the inner loop
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    break aa; // This breaks the outer loop labeled 'aa' when both i and j are 2
                }
                System.out.println(i + " " + j); // This prints the values of i and j
            }
        }
    }
}
