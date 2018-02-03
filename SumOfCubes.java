/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 3.2
 *****************************************************************************/
package second.assignment;

import java.util.Scanner;

public class SumOfCubes {

	private static Scanner scan;

	public static void main(String[] args) {
		// main reads and prints the sum of two integer values cubed.
		int a, b, sum;
		scan = new Scanner(System.in);
		System.out.println("Enter the value of the first integer a: ");
		a = scan.nextInt();
		System.out.println("Enter the value of the second integer b: ");
		b = scan.nextInt();
		sum = (int) (Math.pow(a, 3)+Math.pow(b, 3));
		System.out.println("The sum of the cube of the two integers are: " +sum);
	}
}
