/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 5.9
 *****************************************************************************/
package fifth.assignment;

public class Bulb {

	public static final boolean ON = true;
	public static final boolean OFF = false;

	// Constructors.
	public Bulb() {
		this.state = OFF;
	}

	public Bulb(boolean state) {
		this.state = state;
	}

	// Methods
	public void change() {
		state = !state;
	}

	public boolean getState() {
		return state;
	}

	public boolean isOn() {
		return state;
	}

	public boolean isOff() {
		return !state;
	}

	public String stateToString() {
		if (state == ON)
			return "on";
		else
			return "off";
	}

	private boolean state;
}
