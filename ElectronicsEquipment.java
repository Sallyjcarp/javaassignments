/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.7
*****************************************************************************/
package assignments.resources;

//Parent class
public class ElectronicsEquipment {

	protected double weight;
	protected double cost;
	protected double powerUsage;
	protected String manufacturer;

	public ElectronicsEquipment(double wt, double cst, double Powerusg, String manuf) {
		weight = wt;
		cost = cst;
		powerUsage = Powerusg;
		manufacturer = manuf;
	}

	public double getCost() {
		return cost;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getPowerUsage() {
		return powerUsage;
	}

	public double getWeight() {
		return weight;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPowerUsage(double powerUsage) {
		this.powerUsage = powerUsage;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
