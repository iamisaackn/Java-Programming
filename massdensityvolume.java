/*

What is the relationship between mas, density and volume. Write a program that prompts the
user for the mass of an object, the density and the calculate the volume.

 */

import java.util.Scanner;

public class massdensityvolume {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        // Input the mass
        System.out.println("Enter the mass: ");
        double mass = src.nextDouble();

        // Input the density
        System.out.println("Enter the density: ");
        double density = src.nextDouble();

        // Calculate the volume
        double volume = (double) (mass / density);
        System.out.println("Volume: " + volume);

        }
}
