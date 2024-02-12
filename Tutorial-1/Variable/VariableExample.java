public class VariableExample{ // Defining a public class named VariableExample

    int data=50; // This is an instance variable. It is declared in a class but outside a method and it is accessible to all methods of the class.

    static int m=100; // This is a static variable. It is declared within a class, outside any method, with the keyword 'static'.

    public static void main(String [] args){ // Main method that executes when the program runs

        System.out.println("Working with variables"); // Prints "Working with variables" to the console

        // The following line is commented out because it would introduce an error. 
        // Instance variables cannot be accessed from static methods directly, including the main method.
        // System.out.Println(data+""); 

        int a=50; // This is a local variable. It is declared inside a method (main method in this case) and it can only be used within that method.

        System.out.println(m+""); // Prints the static variable 'm' to the console

        System.out.println(a); // Prints the local variable 'a' to the console
    }
}
