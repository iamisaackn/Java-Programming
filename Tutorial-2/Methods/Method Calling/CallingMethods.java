
// class declaration
public class CallingMethods{
    //method declaration
    public static void method1(){};
    public static int method2(){
        return 6;
    };

    public static double method3(){
        return 7.3;
    };

    public static void main(String[] args) {
    //Calling the methods
    method1();// Method 1 is called by itself. This is because it of type void
    
    int s=method2();
    double r=method3();

    Rectangle R1=rectMethod4();
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






