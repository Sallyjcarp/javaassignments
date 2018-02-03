/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 5.10
 *****************************************************************************/
package fifth.assignment;

public class SnakeEyes {
	public static void main(String[] args) {

		PairOfDice die = new PairOfDice();
		int dieVal = die.sumOfDice();
		System.out.println("The sum of the dice for roll: is: " + dieVal);
	}

}
