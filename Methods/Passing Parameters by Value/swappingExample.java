
public static void main(String[] args) {
    int a = 30;
    int b = 45;
    System.out.println("Before swapping, a =" +a + " and b= " + b);
    // Invoke the swap method
    swap(a, b);
    // a and b values will be unchanged here because Java is pass-by-value
    System.out.println("After swapping, a = " +a + " and b is " + b);
}//end of main
//Creating the swap method
public static void swap(int a, int b) {
    System.out.println("Before swapping(Inside), a="+a+ " b = " + b);
    // Swap a with b
    int c = a;
    a = b;
    b = c;
    // a and b values are swapped inside this method
    System.out.println("After swapping(Inside), a = " + a+ " b = " + b);
}


