/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 7.9
 *****************************************************************************/
package seventh.assignment;

//Create address list
public class AddressListModified {

	private int count;
	private NameListModified[] collection;

	public AddressListModified() {
		collection = new NameListModified[25];
		count = 0;
	}

	public void addAddress(String FirstName, String LastName, String Street, String City, String State, int Zip, long Phone) {

		collection[count] = new NameListModified(FirstName, LastName, Street, City, State, Zip, Phone);
		count++;
	}

	public String toString() {
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Address List \n\n";
		report += "No of people: " + count + "\n";
		report += "\n\nAddress List:\n\n";
		for (int cnt = 0; cnt < collection.length; cnt++)
			report += collection[cnt].toString() + "\n";
		return report;

	}

}
