/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 7.9
 *****************************************************************************/
package seventh.assignment;

//Create Name list.
public class NameListModified {

	private String FirstName;
	private String LastName;
	private String Street;
	private String City;
	private String State;
	private int Zip;
	private long Phone;

	public NameListModified(String FN, String LN, String St, String Cty, String Ste, int code, long Ph) {
		FirstName = FN;
		LastName = LN;
		Street = St;
		City = Cty;
		State = Ste;
		Zip = code;
		Phone = Ph;
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

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public String toString() {
		return FirstName + "\t" + LastName + "\t" + Street + "\t" + City + "\t" + State + "\t" + Zip + "\t" + Phone
				+ "\t";
	}

}
