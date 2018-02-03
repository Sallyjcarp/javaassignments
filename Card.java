/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 7.7
*****************************************************************************/
package seventh.assignment;

public class Card {
	private String face;
	private String suit;

	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}

	public String toString() {
		return face + " of " + suit;
	}

}
