/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 3.4
 *****************************************************************************/
package second.assignment;

import java.util.Scanner;

public class PointDistance {

	private static Scanner scan;

	public static void main(String[] args) {
		// main reads (x,y) coordinates for two points and calculates the distance between the points.
		double x1, x2, y1, y2, distance;
		scan = new Scanner(System.in);
		System.out.println("Enter the coordinates for x1: ");
		x1 = scan.nextDouble();
		System.out.println("Enter the coordinates for y1: ");
		y1 = scan.nextDouble();
		System.out.println("Enter the coordinates for x2: ");
		x2 = scan.nextDouble();
		System.out.println("Enter the coordinates for y2: ");
		y2 = scan.nextDouble();
		distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println("The distance between the two points is: " +distance);
	}

}
