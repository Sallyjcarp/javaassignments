/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.10-d
 *****************************************************************************/
package fourth.Assignment;

public class StarsDiamond {
	public static void main(String[] args) {
		int AMAX = 5, KMAX = 5;
		// initialize the variable
		for (int a = 1; a <= AMAX; a++) {
			for (int c = a; c < AMAX; c++) {
				System.out.print(" ");
			}
			// initialize the variable to print stars
			for (int d = 1; d < 2 * a; d++) {
				System.out.print("*");
			}
			// move cursor to next line
			System.out.println();
		}

		for (int k = 1; k <= KMAX; k++) {
			for (int l = 1; l < k; l++) {
				System.out.print(" ");
			}
			// initialize the variable to print stars
			for (int m = 2 * KMAX; m >= 2 * k; m--) {
				System.out.print("*");
			}
			// move cursor to new line
			System.out.println();
		}

	}
}
