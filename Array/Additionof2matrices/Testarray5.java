package Additionof2matrices;

public class Testarray5 {

 public static void main(String args[]) {
  
 // Create 2 matrices
  int a[][] = {{1, 2, 3}, {4, 5, 6}};
  int b[][] = {{1, 2, 3}, {4, 5, 6}};

 // create a sum matrix
  int c[][] = new int [2][3];

 // adding and print addition of 2 matrices
  for (int i = 0; i < 2; i++) {

   for (int j = 0; j < 3; j++) {
   c[i][j] = a[i][j] + b[i][j];
   System.out.print(c[i][j]+" ");
   } // inner for loop
   
   System.out.println();
  }// outer for loop

 } // main method End
} // class End
