/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 3.5
 *****************************************************************************/
package second.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolnSurfcAreaCircle {

	private static Scanner scan;

	public static void main(String[] args) {
		// main reads the radius of a sphere and prints its volume and surface area.
		double radius, surfacearea, volume;
		scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		radius = scan.nextDouble();
		surfacearea = 4 * Math.PI * Math.pow(radius, 2);
		volume = (4 / 3) * (Math.PI * Math.pow(radius, 3));
		DecimalFormat dfmt = new DecimalFormat("0.####");
		System.out.println("The surface area of the circle is: " + dfmt.format(surfacearea));
		System.out.println("The volume of the circle is: " + dfmt.format(volume));
	}

}
