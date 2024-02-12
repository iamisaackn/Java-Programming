public class MethodCaller {
    public static void callMethod1() {}
    public static int callMethod2() { return 0; }
    public static double callMethod3() { return 0.0; }
    
    public static void main(String[] args) {
        // Invoking the methods
        callMethod1(); // Method 1 is invoked directly as it is of type void
        int integerResult = callMethod2();
        double doubleResult = callMethod3();
        Rectangle rectangleInstance = createRectangle();
        Employee employeeInstance = createEmployee();
        Employee[] employeeArray = createEmployeeArray();
    }
    
    public static Rectangle createRectangle() { return new Rectangle(); } // A method that creates a rectangle
    public static Employee createEmployee() { return new Employee(); } // A method that creates an employee
    public static Employee[] createEmployeeArray() { return new Employee[0]; } // A method that creates an array of employees
}
