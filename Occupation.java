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
public class Occupation extends People {
	private String employType;
	private int count;

	public Occupation(int population, String EmployType, int Count) {
		super(population);
		employType = EmployType;
		count = Count;
	}

	public String getOccPercentage() {
		DecimalFormat fmt = new DecimalFormat("0.###");
		double pop = (double) population;
		double ct = (double) count;
		double val = ct / pop * 100;
		return fmt.format(val);
	}

	public String getEmployType() {
		return employType;
	}

	public void setEmployType(String employType) {
		this.employType = employType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
