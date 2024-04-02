package PassingArraytoMethod;

// Class declaration
public class Testarray2 {

 public static void min(int arr[]) {
 // Declaration
 int min = arr[0];
 
  // For Loop
  for(int i = 1; i<arr.length;i++){
    // If Statement
    if(min>arr[i]){
    min = arr[i];
    System.out.println(min);
    }
  }

}
 
// Declaration of main method
 public static void main(String args[]) {
  int a[] = {1, 2, 3, 4, 5};
  min(a); // Passing an array to a method
 }// main End
 
} // Class End 