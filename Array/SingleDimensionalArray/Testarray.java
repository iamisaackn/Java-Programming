package SingleDimensionalArray;

// Class
public class Testarray {

    public static void main(String args[]) {
    int a[] = new int[5]; // Declaration, instantiation and initialization
    
    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;
    
    // Print the array
    for(int i = 1; i < a.length; i++) {
    System.out.println(a[i]);
    }// For Loop

    }// End main method
    
}// Class