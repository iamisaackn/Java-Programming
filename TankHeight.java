/*

 A rectangular tank whose capacity is 200 liters has a length of 50 cm and width 320 cm. Write a
program that will receive the above parameters and output the height of the tank

 */

public class TankHeight {
    public static void main(String[] args) {

        //----------- Parameters -----------------
        double capacityLiters = 200;
        double lengthcm = 50;
        double widthcm = 320;

        // Changing the Liters to cm^3
        double capacityCM = capacityLiters * 1000;

        // Finding the height
        double heightcm = capacityCM / (lengthcm * widthcm);

        // Display the height
        System.out.println("The height of the tank: " + heightcm + "cm^3");
    }
}
