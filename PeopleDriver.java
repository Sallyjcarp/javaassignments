/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.5
*****************************************************************************/
package eighth.assignment;

//The people driver class instantiates the Age,Nationality,Occupation, and Income classes.
public class PeopleDriver {
	public static void main(String[] args) {
		Age a = new Age(1123, "Adult", 572);
		System.out.println("The adult population is: " + a.getAgePercentage());
		Nationality nation = new Nationality(1123, "American", 326);
		System.out.println("The American population percentage is: " + nation.getNatPercentage());
		Occupation occ = new Occupation(320, "Retail Sales", 5);
		System.out.println("The retail sales occupation percentage is: " + occ.getOccPercentage());
		Income inc = new Income(1123, "Higher Income", 110);
		System.out.println("The Higher income population percentage is: " + inc.getIncAmount());

	}

}
