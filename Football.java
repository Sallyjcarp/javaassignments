/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.4
*****************************************************************************/
package eighth.assignment;

//Child class
public class Football extends Sports {
	private int touchdown;

	public Football(int Touchdown, int Points, int win, int loss, int game) {
		super(win, loss, game);
		touchdown = Touchdown;
		points = Points;
	}

	public int totalPointsEarned() {
		int total = win * (touchdown * points) - (game - loss);
		return total;
	}

	public int getTouchdown() {
		return touchdown;
	}

	public void setTouchdown(int touchdown) {
		this.touchdown = touchdown;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	private int points;

}
