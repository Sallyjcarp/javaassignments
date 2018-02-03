/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 9.1
*****************************************************************************/
package ninth.assignment;

public class Volunteer implements Payable {
	protected String eName, eAddress, ePhone;

	// Constructor: Sets up this volunteer using the specified information.
	public Volunteer(String eName, String eAddress, String ePhone) {
		this.eName = eName;
		this.eAddress = eAddress;
		this.ePhone = ePhone;
	}

	// Returns a zero pay value for this volunteer.
	public String toString() {
		String result = "Name: " + eName;
		result += "\nAddress: " + eAddress;
		result += "\nPhone: " + ePhone;
		return result;
	}

	public double pay() {
		return 0.0;
	}

}
