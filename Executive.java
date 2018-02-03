/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 9.1
*****************************************************************************/
package ninth.assignment;

//Executive child class.
public class Executive extends Employee {
	private double bonus;

	// Constructor: Sets up this executive with the specified information.
	public Executive(String eName, String eAddress, String ePhone, String socialSecurityNumber, double payRate) {
		super(eName, eAddress, ePhone, socialSecurityNumber, payRate);
		bonus = 0; // bonus has yet to be awarded
	}

	// Awards the specified bonus to this executive.
	public void awardBonus(double execBonus) {
		bonus = execBonus;
	}

	// Computes and returns the pay for an executive, which is the
	// regular employee payment plus a one-time bonus.

	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}

}
