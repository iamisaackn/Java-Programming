public class ExampleVoid {
    public static void main(String[] args) {
        // Calling the RankPoints method with 255.7 as the argument
        RankPoints(255.7);
    }
    // This is a void method that takes a double as an argument
    public static void RankPoints(double points) {
        // If points is greater than or equal to 202.5, print "Rank:A1"
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }
        // If points is less than 202.5 but greater than or equal to 122.4, print "Rank:A2"
        else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }
        // If points is less than 122.4, print "Rank:A3"
        else {
            System.out.println("Rank:A3");
        }
    }
}
