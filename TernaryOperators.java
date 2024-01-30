class TernaryOperators{
public static void main(String arg[]){
int marks;
marks = 60;
String grd;
// In this case we use String.valueOf() method to convert the passed argument to a string
grd = (marks>=40)?String.valueOf("Pass"):String.valueOf("Fail");
System.out.println("The grade is: " + grd);
}
}