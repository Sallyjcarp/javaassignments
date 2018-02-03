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
public class Income extends People {
	private String highIncome;
	private int count;

	public Income(int population, String highinc, int ct) {
		super(population);
		highIncome = highinc;
		count = ct;
	}

	public String getIncAmount() {
		DecimalFormat fmt = new DecimalFormat("0.###");
		double pop = (double) population;
		double ct = (double) count;
		double val = ct / pop * 100;
		return fmt.format(val);
	}

	public String getHighIncome() {
		return highIncome;
	}

	public void setHighIncome(String highIncome) {
		this.highIncome = highIncome;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
