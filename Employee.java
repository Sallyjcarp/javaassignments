/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 9.1
*****************************************************************************/
package ninth.assignment;

//Parent class to Executive and hourly classes.
public class Employee implements Payable {
	protected String eName, eAddress, ePhone, socialSecurityNumber;
	protected double payRate;

	// Constructor: Sets up this employee with the specified information.
	public Employee(String eName, String eAddress, String ePhone, String socialSecurityNumber, double payRate) {
		this.eName = eName;
		this.eAddress = eAddress;
		this.ePhone = ePhone;
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}

	// Returns information about an employee as a string.
	public String toString() {
		String result = "Name: " + eName;
		result += "\nAddress: " + eAddress;
		result += "\nPhone: " + ePhone;
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}

	// Returns the pay rate for this employee.
	public double pay() {
		return payRate;
	}

}
