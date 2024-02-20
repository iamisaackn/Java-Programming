public class Rectangle {
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


// class declaration
public class CallingMethods{
 //method declaration
 public static void method1(){};
 public static int method2(){};
 public static double method3(){};

 public static void main(String[] args) {
 //Calling the methods
 method1();// Method 1 is called by itself. This is because it of type void
 
 int s=method2();
 double r=method3();

 Rectangle R1=rectMethod4();
 Employee E=epmMethod5();
 Employee [] Emps=epmMethod6();
 }//End of main method

 public static Rectangle rectMethod4(){}; // A method that returns a rectangle
 public static Employee epmMethod5(){}; // A method that returns an employee
 public static Employee [] empMethod6(){}; //A method that returns an array of employees
}//End of class
