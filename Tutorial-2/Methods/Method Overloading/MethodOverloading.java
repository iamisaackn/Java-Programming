public class MethodOverloading {
    // Q1
    public static int sum(int a, int b, int c, int d) {
    return a+b+c+d;
    }
   
    // Q2
    public static int sum(int a, int b) {
    return a+b;
    }
   
    // Q3
    public static int sum(int a, int b, int c) {
    return a+b+c;
    }
   
    // Q4
    public static double sum(double a, double b) {
    return a+b;
    }
   
    // Q5
    public static double sum(double a, double b, double c){
    return a+b+c;
    }
   
    // main method
    public static void main(String args[]){
   
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
   
    int s1 = sum(a, b, c, d); // Sum of Q1
    System.out.println("Sum of S1 is " + s1);
   
    int s2 = sum(a, b); // Sum of Q2
    System.out.println("Sum of S2 is " + s2);
   
    int s3 = sum(a, b, c); // Sum of Q3
    System.out.println("Sum of S3 is " + s3);
   
    double s4 = sum(a, b); // Sum of Q4
    System.out.println("Sum of S4 is " + s4);
   
    double s5 = sum(a, b, c); // Sum of Q5 
    System.out.println("Sum of S5 is " + s5);
   
    } // main End
   } // class End
   