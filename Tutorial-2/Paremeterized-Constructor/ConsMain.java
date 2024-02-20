// A simple constructor.
class MyClass {
    int x;

    // Following is the constructor
    MyClass(int i) {
        x = i;
    }

    // A method to set x
    public void setX(int z) {
        x = z;
    }

    // A method to get x
    public int getX() {
        return x;
    }
} // End of Class

// You would call constructor to initialize objects as follows:
public class ConsMain {
    public static void main(String args[]) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.getX() + " " + t2.getX());
        t2.setX(40); // Setting the value of x using the setX method
        System.out.println(t1.getX() * t2.getX());
    }
}

