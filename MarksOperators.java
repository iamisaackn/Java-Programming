// This class simulates the generation of marks and grading
class MarksOperators {
    public static void main(String args[]) {
        // Declare an integer variable to store the marks
        int marks;

        // Generate a random mark between 20 and 115
        // Math.random() generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        // Math.ceil() rounds up the value to the nearest integer
        // The result is then cast to an integer and added to 20
        marks = 20 + (int)(Math.ceil(Math.random() * 95));

        // Declare a String variable to store the grade
        String grd;

        // Use a ternary operator to assign the grade based on the mark
        // If the mark is greater than or equal to 40, the grade is "Pass"
        // Otherwise, the grade is "Fail"
        grd = (marks >= 40) ? String.valueOf("Pass") : String.valueOf("Fail");

        // Print the generated mark and grade to the console
        System.out.println("The mark generated is: " + marks + " and the grade is " + grd);
    }
}
