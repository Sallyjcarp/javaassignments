/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 3.6
 *****************************************************************************/
package second.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {

	private static Scanner scan;

	public static void main(String[] args) {
		// main reads the length of the sides of a triangle and calculates and prints the area.
		double a, b, c, s, area;
		scan = new Scanner(System.in);
		System.out.println("Enter the length of side a: ");
		a = scan.nextDouble();
		System.out.println("Enter the length of side b: ");
		b = scan.nextDouble();
		System.out.println("Enter the length of side c: ");
		c = scan.nextDouble();
		s = a + b + c;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		DecimalFormat dfmt = new DecimalFormat("0.##");
		System.out.println("The area of the Triangle is: " + dfmt.format(area));
	}

}
