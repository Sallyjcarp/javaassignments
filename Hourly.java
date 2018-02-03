/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 9.1
*****************************************************************************/
package ninth.assignment;

//Hourly child class.
public class Hourly extends Employee {
	private int hoursWorked;

	// Constructor: Sets up this hourly employee using the specified information.
	public Hourly(String eName, String eAddress, String ePhone, String socialSecurityNumber, double payRate) {
		super(eName, eAddress, ePhone, socialSecurityNumber, payRate);
		hoursWorked = 0;
	}

	// Adds the specified number of hours to this employee's accumulated hours.
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}

	// Computes and returns the pay for this hourly employee.
	public double pay() {
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}

	// Returns information about this hourly employee as a string.
	public String toString() {
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		// count--;
		return result;
	}

}
