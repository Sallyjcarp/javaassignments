/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 7.8
 *****************************************************************************/
package seventh.assignment;

//Create address list
public class AddressList {

	private int count;
	private NameList[] collection;

	public AddressList() {
		collection = new NameList[25];
		count = 0;
	}

	public void addAddress(String FirstName, String LastName, int Zip) {

		collection[count] = new NameList(FirstName, LastName, Zip);
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
