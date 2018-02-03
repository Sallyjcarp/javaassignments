/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.7
*****************************************************************************/
package assignments.resources;

//Child class
public class Equipment extends ElectronicsEquipment {

	private String EquipmentType;

	public Equipment(double wt, double cst, double Powerusg, String manuf, String equipType) {
		super(wt, cst, Powerusg, manuf);
		EquipmentType = equipType;
	}

	public String getEquipmentType() {
		return EquipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		EquipmentType = equipmentType;
	}
}
