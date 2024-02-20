public class ExampleVoid {
public static void main(String[] args) {
RankPoints(255.7);// Calling the method. Note that it is a statement
}
// An example of a void method
public static void RankPoints(double points) {
if (points >= 202.5) {
System.out.println("Rank:A1");
}
else if (points >= 122.4) {
System.out.println("Rank:A2");
}
else {
System.out.println("Rank:A3");
}
}
}
