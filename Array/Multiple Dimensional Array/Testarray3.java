public class Testarray3 {
 public static void main(String args[]){

  // Declaring and initialization of 2D array
   int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    //Output the 2D Array
     for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
       System.out.println(arr[i][j] + " ");
      }// inner for loop End
      System.out.println();
     } // for loop End
     
 }// main End
}// class End
