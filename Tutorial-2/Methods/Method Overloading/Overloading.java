public class Overloading{
public static void main(String[] args) {
int a = 11;
int b = 6;
double c = 7.3;
double d = 9.4;
int result1 = min(a, b);
// same function name with different parameters
double result2 = min(c, d);
System.out.println("Minimum Value = " + result1);
System.out.println("Minimum Value = " + result2);
}
// for integer
public static int min(int n1, int n2) {
int min;
if (n1 > n2)
min = n2;
else
min = n1;
return min;
}
// for double
public static double min(double n1, double n2) {
double min;
if (n1 > n2)
min = n2;
else
min = n1;
return min;
}
}
