/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 5.13
 *****************************************************************************/
package fifth.assignment;

public class DrawCard {
	public static void main(String[] args) {
		//main draws random cards and prints 5 random cards
		for (int a = 1; a <= 5; a++) {
			Card card = new Card();
			int faceNum = card.drawFace();
			int SuiteNum = card.drawSuite();
			String faceVal = card.getFaceName(faceNum);
			String suiteVal = card.getSuiteName(SuiteNum);

			System.out.print("The drawn card no " + a + " is: ");
			System.out.println(faceVal + " of " + suiteVal);
		}
	}

}
