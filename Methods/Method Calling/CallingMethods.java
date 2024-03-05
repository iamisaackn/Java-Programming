
// class declaration
public class CallingMethods{
    //method declaration
    public static void callmethod1(){};
    public static int callmethod2(){
        return 6;
    };

    public static double callmethod3(){
        return 7.3;
    };

    public static void main(String[] args) {

        //Calling the methods
        callmethod1();// Method 1 is called by itself. This is because it of type void
        int integerResult = callmethod2();
        double doubleResult = callmethod3();

        Rectangle rectangleInstance = createRectangle();
        Employee employeeInstance = createEmployee();
        Employee[] employeeArray = createEmployeeArray();
        }//End of main method

        public static Rectangle rectMethod4(){
            return new Rectangle(5, 6);
    }; // A method that returns a rectangle

}//End of class


class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
}






