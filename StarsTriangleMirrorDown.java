/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.10-c
 *****************************************************************************/
package fourth.Assignment;

public class StarsTriangleMirrorDown {
	public static void main(String[] args) {
		int IMAX = 10;
		// initialize the variable
		for (int i = 1; i <= 10; i++) {
			// initialize loop to print spaces
			for (int j = 0; j < i - 1; j++) {
				// print spaces
				System.out.print(" ");
			}
			// initialize loop to print stars
			for (int k = 1; k < IMAX - (i - 1); k++) {
				// print stars
				System.out.print("*");
			}
			System.out.println("*");
		}

	}

}
