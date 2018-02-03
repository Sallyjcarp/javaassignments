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
public class Basketball extends Sports {
	private int points;

	public Basketball(int Points, int win, int loss, int game) {
		super(win, loss, game);
		points = Points;
	}

	public int pointsEarned() {
		int val = win * points - (game - loss);
		return val;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
