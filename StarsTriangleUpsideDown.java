/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.10-a
 *****************************************************************************/
package fourth.Assignment;

public class StarsTriangleUpsideDown {
	public static void main(String[] args) {
		// initialize the variable
		for (int i = 10; i >= 1; i--) {
			// initialize loop to print stars
			for (int j = 1; j <= i; j++) {
				// print stars
				System.out.print("*");

			}
			// move cursor to the next line
			System.out.println();
		}
	}

}
