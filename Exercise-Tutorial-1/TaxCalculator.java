// import library
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input "value" of the imported item
        System.out.println("Enter the value of the imported item: ");
        double value = scanner.nextDouble();

        // Calculating customDuty and purchaseTax
        double customDuty = 0.30 * value;
        double purchaseTax = 0.20 * (value + customDuty);
        double totalPercentageCharged = (customDuty + purchaseTax) / value *100;

        // Output customDuty, purchaseTax, and totalPercentageCharged
        System.out.println("Custom Duty: " + customDuty);
        System.out.println("Purchase Tax: " + purchaseTax);
        System.out.println("Total Percentage Charge: " + totalPercentageCharged);


    }
}



