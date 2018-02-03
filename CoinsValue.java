/*

 *****************************************************************************

 *

 * Name: Sally Carpenter


 * Course Number: SEIS601 - 01

 *

 * Description: Prints to the terminal window.

 * Program 2.8

 *****************************************************************************/
package second.assignment;

import java.util.Scanner;

public class CoinsValue {

	public static void main(String[] args) {
		// main reads value of coins and prints dollars and cents.

		int quarters, dimes, nickels, pennies;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of quarters: ");
		quarters = scan.nextInt();
		System.out.println("Enter the number of dimes: ");
		dimes = scan.nextInt();
		System.out.println("Enter the number of nickels: ");
		nickels = scan.nextInt();
		System.out.println("Enter the number of pennies: ");
		pennies = scan.nextInt();

		int quarterval = 25 * quarters;
		int dimeval = 10 * dimes;
		int nickelval = 5 * nickels;
		int pennieval = 1 * pennies;

		int sumtotal = quarterval + dimeval + nickelval + pennieval;
		int dollar = sumtotal / 100;
		int cents = sumtotal % 100;
		System.out.println("The sum total is: " + dollar + " Dollars and " + cents + " Cents");

	}

}
