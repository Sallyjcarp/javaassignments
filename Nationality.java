/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.5
*****************************************************************************/
package eighth.assignment;

import java.text.DecimalFormat;

//Child class
public class Nationality extends People {
	private String nationalityType;
	private int count;

	public Nationality(int population, String nat, int Count) {
		super(population);
		nationalityType = nat;
		count = Count;
	}

	public String getNatPercentage() {
		DecimalFormat fmt = new DecimalFormat("0.###");
		double pop = (double) population;
		double ct = (double) count;
		double val = ct / pop * 100;
		return fmt.format(val);

	}

	public String getNationalityType() {
		return nationalityType;
	}

	public void setNationalityType(String nationalityType) {
		this.nationalityType = nationalityType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
