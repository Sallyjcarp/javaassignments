/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 7.8
 *****************************************************************************/
package seventh.assignment;

public class AddressListMain {

	public static void main(String[] args) {
		// Create array list of objects.
		AddressList addlist = new AddressList();
		addlist.addAddress("John", "Doe", 55344);
		addlist.addAddress("Jane", "Doe", 55343);
		addlist.addAddress("Sarah", "Water", 55341);
		addlist.addAddress("Joe", "Loston", 55344);
		addlist.addAddress("Rachel", "Rae", 55343);
		addlist.addAddress("Sean", "Loon", 55341);
		addlist.addAddress("Josh", "Wheat", 55344);
		addlist.addAddress("Sarah", "Rice", 55343);
		addlist.addAddress("Beth", "Quincy", 55341);
		addlist.addAddress("Carol", "Clark", 55344);
		addlist.addAddress("Katy", "Kline", 55343);
		addlist.addAddress("Lyle", "Brooks", 55341);
		addlist.addAddress("Wayne", "Prawn", 55344);
		addlist.addAddress("Tron", "White", 55343);
		addlist.addAddress("Kyle", "Lavine", 55341);
		addlist.addAddress("Paul", "Von", 55344);
		addlist.addAddress("Tracy", "Right", 55343);
		addlist.addAddress("Dan", "Durk", 55341);
		addlist.addAddress("Troy", "Cotton", 55344);
		addlist.addAddress("Perry", "White", 55343);
		addlist.addAddress("Cassie", "Kaye", 55341);
		addlist.addAddress("Mylie", "Jackson", 55344);
		addlist.addAddress("Mike", "Brown", 55343);
		addlist.addAddress("Henry", "Plummer", 55341);
		addlist.addAddress("Halley", "Rogers", 55341);
		System.out.println(addlist);
	}

}
