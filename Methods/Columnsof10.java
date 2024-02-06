// This is the main class named Columnsof10 
public class Columnsof10 {
    // This is the main method that the Java Virtual Machine (JVM) calls when the program starts
    public static void main(String[] args) {
        // This outer loop will run from 1 to 120
        for(int i=1; i<=120; i++){
           System.out.println(i);
           if(i%10 == 0){
               System.out.println();
           }
        } // End of for loop 1
    } // End of main
} //End of class
