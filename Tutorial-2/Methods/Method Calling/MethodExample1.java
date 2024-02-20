<<<<<<< HEAD
public class MethodExample1{
//Declaring the method
public static sum( int a, int b , int c){
return a+b+c;
}
public static void main(String[] args) {
//Providing needed data
int x=45, y=67;z=34;
//Calling method sum
int s=sum(x,y,z);
System.out.println(“Sum is”+ sum);
}//End of main
}//End of class
=======
public class MethodExample1 {
    // Declaring the method
    public static int sum(int a, int b, int c) {
        // The method takes three integers as parameters and returns their sum
        return a + b + c;
    }

    public static void main(String[] args) {
        // Providing needed data
        int x = 45, y = 67, z = 34;

        // Calling method sum and storing the result in variable 's'
        int s = sum(x, y, z);

        // Printing the result
        System.out.println("Sum is " + s);
    } // End of main
} // End of class
>>>>>>> 4f2accb72c96d82230602b3d0bee4457d7f9712d
