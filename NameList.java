/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 7.8
 *****************************************************************************/
package seventh.assignment;

//Create Name list.
public class NameList {

	private String FirstName;
	private String LastName;
	private int Zip;

	public NameList(String FN, String LN, int pin) {
		FirstName = FN;
		LastName = LN;
		Zip = pin;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

	public String toString() {
		return FirstName + "\t" + LastName + "\t" + Zip;
	}

}
