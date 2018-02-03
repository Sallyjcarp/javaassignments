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
public class Age extends People {
	private String AgeGroup;
	private int count;

	public Age(int population, String ag, int Count) {
		super(population);
		AgeGroup = ag;
		count = Count;
	}

	public String getAgePercentage() {
		DecimalFormat fmt = new DecimalFormat("0.###");
		double pop = (double) population;
		double ct = (double) count;
		double val = ct / pop * 100;
		return fmt.format(val);
	}

	public String getAgeGroup() {
		return AgeGroup;
	}

	public int getCount() {
		return count;
	}

	public void setAgeGroup(String ageGroup) {
		AgeGroup = ageGroup;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
