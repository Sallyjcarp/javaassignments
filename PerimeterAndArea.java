/*

 *****************************************************************************

 *

 * Name: Sally Carpenter


 * Course Number: SEIS601 - 01

 *

 * Description: Prints to the terminal window.

 * Program 2.10

 *****************************************************************************/
package second.assignment;

import java.util.Scanner;

public class PerimeterAndArea {

	
	public static void main(String[] args) {
		// main function that prints the area of a square and perimeter of a square.

		int side, area, perimeter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of the side of the square in meter:");
		side = scan.nextInt();
		area = side*side;
		System.out.println("The area of the square is: " +area+ " square meters");
		perimeter = 4*side;
		System.out.println("The perimeter of the square is: " +perimeter+ " meters");
	}

}
