class TernaryOperators{ // Defining a class named TernaryOperators

    public static void main(String arg[]){ // Main method that executes when the program runs

        int marks; // Declaring an integer variable 'marks'
        marks = 60; // Assigning the value 60 to 'marks'

        String grd; // Declaring a string variable 'grd'

        // Using a ternary operator to check if 'marks' is greater than or equal to 40
        // If 'marks' is greater than or equal to 40, "Pass" is assigned to 'grd'
        // If 'marks' is less than 40, "Fail" is assigned to 'grd'
        // String.valueOf() method is used to convert the passed argument to a string
        grd = (marks>=40)?String.valueOf("Pass"):String.valueOf("Fail");

        // Printing the value of 'grd' to the console
        System.out.println("The grade is: " + grd);
    }
}
