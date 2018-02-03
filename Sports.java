/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.4
*****************************************************************************/
package eighth.assignment;

//Parent class 
public class Sports {
	protected int win, loss, game;

	public Sports(int Win, int Loss, int Game) {
		win = Win;
		loss = Loss;
		game = Game;
	}

	public int getGame() {
		return game;
	}

	public int getLoss() {
		return loss;
	}

	public int getWin() {
		return win;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public void setWin(int win) {
		this.win = win;
	}

}
