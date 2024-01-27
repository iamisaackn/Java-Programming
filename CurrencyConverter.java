/*

The exchange rate of a Kenyan shilling to Uganda shilling is 1Ksh=24Ush. And an American
dollar to Uganda shillings is 1$=1,950Ush. Write a program that will prompts for any amount of
Kenya shillings and output the corresponding American dollars.

 */

 import java.util.Scanner;

 public class CurrencyConverter {
 
     public static void main(String[] args) {
         // Exchange rates
         double kshtoush = 24;
         double usdtoush = 1950;
 
         Scanner convert = new Scanner(System.in);
 
         // Enter input in ksh
         System.out.println("Enter amount in KSH: ");
         double ksh = convert.nextDouble();
 
         // Convert from ksh to ush
         double ush = ksh * kshtoush;
 
         // Convert from ush to usd
         double usd = ush * (1 / 1950);
 
         // Output in dollar
         System.out.println("Ksh to USD: " + usd);

     }
 }
 