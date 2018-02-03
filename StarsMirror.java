/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.10-b
 *****************************************************************************/
package fourth.Assignment;

public class StarsMirror {
	public static void main(String[] args) {
		// initialize the variable
		int IMAX = 10;
		for (int i = 1; i <= IMAX; i++) {
			// initialize loop to print spaces
			for (int j = 0; j <= IMAX - i; j++) {
				// print spaces
				System.out.print(" ");
			}
			// initialize loop to print stars
			for (int k = 1; k <= i; k++) {
				// print stars
				System.out.print("*");
			}
			// move cursor to the next line
			System.out.println();
		}
	}
}