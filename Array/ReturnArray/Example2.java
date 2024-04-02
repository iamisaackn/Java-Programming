package ReturnArray;

public class Example2 {

    public static double[] returnArray() {
        double arr[] = new double[3];

        arr[0] = 6.9;
        arr[1] = 2.5;
        arr[2] = 11.5;

        return arr;
    }

    public static void main(String args[]) {
        double a[];

        a = returnArray();
        
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        } 
    }
    
}
