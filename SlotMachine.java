/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.15
 *****************************************************************************/
package fourth.Assignment;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
	private static Scanner scan;

	public static void main(String[] args) {

		System.out.println("Welcome to the slot machine game!");
		System.out.print("Please enter 1 to play the game and 0 to quit:");
		int number;
		scan = new Scanner(System.in);
		number = scan.nextInt();
		while (number != 0) {
			Random generator = new Random();
			int num1, num2, num3;
			num1 = generator.nextInt(10);
			num2 = generator.nextInt(10);
			num3 = generator.nextInt(10);
			System.out.println("The numbers in the row are: " + num1 + num3 + num2);
			if (num1 == num2 && num2 == num3) {
				System.out.println("Great job! all the numbers are the same!");
				System.out.println("Please enter 1 to play the game and 0 to quit:");
				number = scan.nextInt();
			} else if (num1 == num2 || num2 == num3 || num3 == num1) {
				System.out.println("Only two numbers are the same");
				System.out.println("Please enter 1 to play the game and 0 to quit:");
				number = scan.nextInt();
			} else {
				System.out.println("None of the numbers are the same");
				System.out.println("Please enter 1 to play the game and 0 to quit:");
				number = scan.nextInt();
			}
		}
		System.out.println("Goodbye!");
	}
}
