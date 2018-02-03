/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 7.7
*****************************************************************************/
package seventh.assignment;

public class DealCard {

	public static void main(String[] args) {

		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		System.out.println(myDeckOfCards.dealCard());
		System.out.println(myDeckOfCards.dealCard());
		System.out.println(myDeckOfCards.dealCard());
		System.out.println(myDeckOfCards.dealCard());
		System.out.println(myDeckOfCards.dealCard());

	}

}
