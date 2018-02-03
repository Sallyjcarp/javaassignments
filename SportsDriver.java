/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.4
*****************************************************************************/
package eighth.assignment;

//The sports driver class instantiates the Basketball and Football classes.
public class SportsDriver {
	public static void main(String[] args) {
		Basketball bb = new Basketball(10, 5, 5, 10);
		System.out.println("The points earned in the Basketball game are: " + bb.pointsEarned());
		Football fb = new Football(2, 6, 5, 5, 10);
		System.out.println("The points earned in the Football game are: " + fb.totalPointsEarned());

	}

}
