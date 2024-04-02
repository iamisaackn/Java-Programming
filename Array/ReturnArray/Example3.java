package ReturnArray;

import java.util.Arrays;

public class Example3 {
    
    public static int[] returnArray() {
        int a1 = 20;
        int a2 = 23;
        int a3 = 87;
        return new int[] {a1, a2, a3};
    }

    public static void main (String args[]) {
        int arr[] = returnArray();
        System.out.println(Arrays.toString(arr));
    }
}
